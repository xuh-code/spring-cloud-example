package cn.xuhweb.common.controller;

import cn.xuhweb.common.util.UserUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xuh
 * DATE 2018/12/15 16:03.
 * version 1.0
 */
@Slf4j
public class BaseController {

    @Autowired
    private HttpServletRequest request;

    /**
     * 根据请求header中的 token获取用户角色
     *
     * @return 角色名
     */
    public List<String> getRole(){
        return UserUtils.getRole(request);
    }

    /**
     * 根据请求heard中的token获取用户ID
     *
     * @return 用户ID
     */
    public Integer getUserId() {
        return UserUtils.getUserId(request);
    }
}
