//package cn.xuhweb.auth.controller;
//
//import cn.xuhweb.common.constant.SecurityConstants;
//import cn.xuhweb.common.util.R;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * Created by xuh
// * DATE 2018/12/16 16:56.
// * version 1.0
// */
//@RestController
//@RequestMapping("/authentication")
//public class AuthenticationController {
//
//    @Autowired
////    @Qualifier(value = "consumerTokenServices")
//    private ConsumerTokenServices consumerTokenServices;
//
//    /**
//     * 认证页面
//     *
//     * @return ModelAndView
//     */
//    @GetMapping("/require")
//    public ModelAndView require() {
//        return new ModelAndView("ftl/login");
//    }
//
//    /**
//     * 用户信息校验
//     *
//     * @param authentication 信息
//     * @return 用户信息
//     */
//    @RequestMapping("/user")
//    public Object user(Authentication authentication) {
//        return authentication.getPrincipal();
//    }
//
//    @PostMapping("/removeToken")
//    @CacheEvict(value = SecurityConstants.TOKEN_USER_DETAIL, key = "#accessToken")
//    public R<Boolean> removeToken(String accessToken){
//        return new R<>(consumerTokenServices.revokeToken(accessToken));
//    }
//
//}
