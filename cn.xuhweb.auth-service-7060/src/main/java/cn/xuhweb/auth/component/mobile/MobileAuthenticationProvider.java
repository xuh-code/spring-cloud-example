package cn.xuhweb.auth.component.mobile;

import cn.xuhweb.auth.feign.UserService;
import cn.xuhweb.auth.util.UserDetailsImpl;
import cn.xuhweb.common.vo.UserVO;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 手机号登录校验逻辑
 * Created by xuh
 * DATE 2018/12/17 0:09.
 * version 1.0
 */
public class MobileAuthenticationProvider implements AuthenticationProvider {

    private UserService userService;

    /**
     * Authentication 中添加手机号对用用户信息
     *
     * @param authentication authentication
     * @return Authentication
     * @throws AuthenticationException  手机号不存在
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        MobileAuthenticationToken mobileAuthenticationToken = (MobileAuthenticationToken) authentication;
        UserVO userVo = userService.findUserByMobile((String) mobileAuthenticationToken.getPrincipal());

        if (userVo == null)
            throw new UsernameNotFoundException("手机号不存在 : " + mobileAuthenticationToken.getPrincipal());

        UserDetailsImpl userDetails = buildUserDeatils(userVo);
        MobileAuthenticationToken authenticationToken = new MobileAuthenticationToken(userDetails.getAuthorities(), userDetails);
        authenticationToken.setDetails(userDetails);
        return authenticationToken;
    }


    private UserDetailsImpl buildUserDeatils(UserVO userVo) {
        return new UserDetailsImpl(userVo);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return MobileAuthenticationToken.class.isAssignableFrom(authentication);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
