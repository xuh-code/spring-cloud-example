package cn.xuhweb.auth.resource7050.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author xuh@fitme.ai
 * @date 2019/1/17 16:04
 */
@Component
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDoRepository userDoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userDoRepository.findByUsername(username);
    }
}
