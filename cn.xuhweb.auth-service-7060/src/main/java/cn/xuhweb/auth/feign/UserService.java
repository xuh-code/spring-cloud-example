package cn.xuhweb.auth.feign;

import cn.xuhweb.auth.feign.impl.UserServiceFallbackImpl;
import cn.xuhweb.common.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by xuh
 * DATE 2018/12/16 23:38.
 * version 1.0
 */
@FeignClient(name = "pig-upms-service", fallback = UserServiceFallbackImpl.class)
public interface UserService {

    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @return UserVo
     */
    @GetMapping("/user/findUserByUsername/{username}")
    UserVO findUserByUsername(@PathVariable("username") String username);


    /**
     * 通过手机号查询用户、角色信息
     *
     * @param mobile 手机号
     * @return UserVo
     */
    @GetMapping("/user/findUserByMobile/{mobile}")
    UserVO findUserByMobile(@PathVariable("mobile") String mobile);

    /**
     * 根据OpenId查询用户信息
     *
     * @param openId openId
     * @return UserVo
     */
    @GetMapping("/user/findUserByOpenId/{openId}")
    UserVO findUserByOpenId(@PathVariable("openId") String openId);
}
