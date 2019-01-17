package cn.xuhweb.auth.resource7050.repository;

import cn.xuhweb.auth.resource7050.entity.UserDo;

public interface UserService {

    UserDo create(String username, String password);
}
