package cn.xuhweb.auth.dao;

import cn.xuhweb.auth.entity.UserDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author xuh@fitme.ai
 * @date 2019/1/17 16:11
 */
public interface UserDoRepository extends CrudRepository<UserDo, Long> {


    UserDetails findByUsername(String username);
}
