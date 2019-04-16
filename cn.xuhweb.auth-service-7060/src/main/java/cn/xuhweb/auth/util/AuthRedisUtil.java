package cn.xuhweb.auth.util;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.redis.JdkSerializationStrategy;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStoreSerializationStrategy;
import org.springframework.stereotype.Component;

/**
 * @author xuh@fitme.ai
 * @date 2019/3/1 9:59
 */
@Component
public class AuthRedisUtil {

    private final RedisConnectionFactory connectionFactory;

    private RedisTokenStoreSerializationStrategy serializationStrategy = new JdkSerializationStrategy();

    private String prefix = "";

    public AuthRedisUtil(RedisConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    private RedisConnection getConnection() {
        return this.connectionFactory.getConnection();
    }

    private byte[] serialize(Object object) {
        return this.serializationStrategy.serialize(object);
    }

    private byte[] serializeKey(String object) {
        return this.serialize(this.prefix + object);
    }

    private byte[] serialize(String string) {
        return this.serializationStrategy.serialize(string);
    }


    public void storeAccessToken(String key, Authentication authentication) {
        RedisConnection conn = this.getConnection();
        try {
            conn.openPipeline();

            byte[] auth = this.serialize(authentication);
            byte[] serializeKey = this.serializeKey(key);
            conn.set(serializeKey, auth);

            conn.closePipeline();
        } finally {
            conn.close();
        }
    }


    public Authentication readAuthentication(String token) {
        byte[] serializeKey = this.serializeKey(token);
        byte[] bytes;
        RedisConnection conn = this.getConnection();

        try {
            bytes = conn.get(serializeKey);
        } finally {
            conn.close();
        }

        Authentication var4 = this.deserializeAuthentication(bytes);
        return var4;
    }

    private Authentication deserializeAuthentication(byte[] bytes) {
        return (Authentication)this.serializationStrategy.deserialize(bytes, Authentication.class);
    }
}
