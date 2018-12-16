package cn.xuhweb.auth.feign.impl;

import cn.xuhweb.auth.feign.UserService;
import cn.xuhweb.common.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 用户服务的fallback
 * Created by xuh
 * DATE 2018/12/16 23:38.
 * version 1.0
 */
@Service
public class UserServiceFallbackImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @return UserVO
     */
    @Override
    public UserVO findUserByUsername(String username) {
        logger.error("调用{}异常:{}", "findUserByUsername", username);
        return null;
    }

    /**
     * 通过手机号查询用户、角色信息
     *
     * @param mobile 手机号
     * @return UserVo
     */
    @Override
    public UserVO findUserByMobile(String mobile) {
        logger.error("调用{}异常:{}", "通过手机号查询用户", mobile);
        return null;
    }

    /**
     * 根据OpenId查询用户信息
     *
     * @param openId openId
     * @return UserVo
     */
    @Override
    public UserVO findUserByOpenId(String openId) {
        logger.error("调用{}异常:{}", "通过OpenId查询用户", openId);
        return null;
    }
}
