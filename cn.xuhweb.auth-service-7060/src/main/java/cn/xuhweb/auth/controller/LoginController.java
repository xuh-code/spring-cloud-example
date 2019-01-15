package cn.xuhweb.auth.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuh@fitme.ai
 * @date 2019/1/15 17:03
 */
@RestController
public class LoginController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello spring security";
    }

    @RequestMapping("/logout")
    public String logout() {
        SecurityContextHolder.clearContext();
        return "logout";
    }
}
