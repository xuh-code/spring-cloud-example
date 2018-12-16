package cn.xuhweb.common.util;

import cn.xuhweb.common.constant.CommonConstant;
import com.alibaba.ttl.TransmittableThreadLocal;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.List;

/**
 * Created by xuh
 * DATE 2018/12/15 16:09.
 * version 1.0
 */
@Slf4j
public class UserUtils {

    private static final ThreadLocal<String> THREAD_LOCAL_USER = new TransmittableThreadLocal<>();
    private static final String KEY_USER = "user";


    /**
     * 根据请求heard中的token获取用户角色
     *
     * @param request request
     * @return 角色名
     */
    public static List<String> getRole(HttpServletRequest request) {
        String token = getToken(request);
        String key = Base64.getEncoder().encodeToString(CommonConstant.SIGN_KEY.getBytes());
        //  jwt 认证信息
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        List<String> roleNames = (List<String>) claims.get("authorities");
        return roleNames;
    }

    /**
     * 根据header中的token获取用户ID
     *
     * @param request request
     * @return 用户ID
     */
    public static Integer getUserId(HttpServletRequest request) {
        String token = getToken(request);
        String key = Base64.getEncoder().encodeToString(CommonConstant.SIGN_KEY.getBytes());
        //  jwt 认证信息
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        Integer userId = (Integer) claims.get("userId");
        return userId;
    }


    /**
     * 获取请求中token
     *
     * @param httpServletRequest request
     * @return token
     */
    public static String getToken(HttpServletRequest httpServletRequest) {
        String authorization = httpServletRequest.getHeader(CommonConstant.REQ_HEADER);
        return StringUtils.substringAfter(authorization, CommonConstant.TOKEN_SPLIT);
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public static void serUser(String username) {
        THREAD_LOCAL_USER.set(username);
        MDC.put(KEY_USER, username);
    }

    /**
     * 从threadLocal 获取用户名
     *
     * @return 用户名
     */
    public static String getUser() {
        return THREAD_LOCAL_USER.get();
    }

    /**
     * 清除用户信息
     */
    public static void cleanAllUserInfo() {
        THREAD_LOCAL_USER.remove();
        MDC.remove(KEY_USER);
    }

}
