package cn.xuhweb.auth.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author xuh@fitme.ai
 * @date 2019/1/15 17:03
 */
@RestController
@RequestMapping("/users")
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "查询当前用户信息")
    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info(principal.toString());
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");

        return principal;
    }
}
