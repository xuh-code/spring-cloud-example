//package cn.xuhweb.auth.component.mobile;
//
//import cn.xuhweb.auth.feign.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
///**
// * 手机号登录配置入口
// * Created by xuh
// * DATE 2018/12/16 23:35.
// * version 1.0
// */
//public class MobileSecurityConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//
//    @Autowired
//    private AuthenticationSuccessHandler mobileLoginSuccessHandler;
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        MobileAuthenticationFilter mobileAuthenticationFilter = new MobileAuthenticationFilter();
//        mobileAuthenticationFilter.setAuthenticationManager(http.getSharedObject(AuthenticationManager.class));
//        mobileAuthenticationFilter.setAuthenticationSuccessHandler(mobileLoginSuccessHandler);
//
//        MobileAuthenticationProvider mobileAuthenticationProvider = new MobileAuthenticationProvider();
//        mobileAuthenticationProvider.setUserService(userService);
//        http.authenticationProvider(mobileAuthenticationProvider)
//                .addFilterAfter(mobileAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//
//
//}
