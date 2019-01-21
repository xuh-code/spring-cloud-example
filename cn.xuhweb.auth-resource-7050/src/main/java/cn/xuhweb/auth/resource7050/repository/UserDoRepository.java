package cn.xuhweb.auth.resource7050.repository;

import cn.xuhweb.auth.resource7050.entity.UserDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDoRepository extends JpaRepository<UserDo, Long> {
    UserDo findByUsername(String username);
}
