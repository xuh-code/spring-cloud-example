//package cn.xuhweb.auth.config;
//
//import cn.xuhweb.auth.component.mobile.MobileSecurityConfigurer;
//import cn.xuhweb.common.config.FilterIgnorePropertiesConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by xuh
// * DATE 2018/12/16 23:22.
// * version 1.0
// */
//@Order(SecurityProperties.BASIC_AUTH_ORDER - 1)
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private FilterIgnorePropertiesConfig filterIgnorePropertiesConfig;
//    @Autowired
//    private MobileSecurityConfigurer mobileSecurityConfigurer;
//}
