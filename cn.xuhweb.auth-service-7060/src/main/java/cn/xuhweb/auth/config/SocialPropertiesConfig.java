package cn.xuhweb.auth.config;

import lombok.Data;

/**
 * social 登录基础配置
 *
 * Created by xuh
 * DATE 2018/12/16 20:36.
 * version 1.0
 */
@Data
public class SocialPropertiesConfig {

    /**
     * 提供商
     */
    private String providerId;
    /**
     * 应用ID
     */
    private String clientId;
    /**
     * 应用密钥
     */
    private String clientSecret;

}
