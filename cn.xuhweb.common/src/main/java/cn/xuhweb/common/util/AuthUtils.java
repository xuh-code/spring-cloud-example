package cn.xuhweb.common.util;

import cn.xuhweb.common.constant.CommonConstant;
import cn.xuhweb.common.util.exception.CheckedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.codec.Base64;
import sun.org.mozilla.javascript.internal.Token;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 认证授权相关工具类
 *
 * @author xuh@fitme.ai
 * @date 2018/12/19 16:44
 */
@Slf4j
public class AuthUtils {

    private static final String BASIC_ = "Basic ";

    public static String[] extractAndDecodeHeader(String header) throws IOException {

        byte[] base64Token = header.substring(6).getBytes("UTF-8");
        byte[] decoded;

        try {
            decoded = Base64.decode(base64Token);
        } catch (IllegalArgumentException e) {
            throw new CheckedException(
                    "Failed to decode basic authentication token");
        }

        String token = new String(decoded, CommonConstant.UTF8);

        int delim = token.indexOf(":");

        if (delim == -1){
            throw new CheckedException("Invalid basic authentication token");
        }

        return new String[]{token.substring(0, delim), token.substring(delim + 1)};
    }

}
