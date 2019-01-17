package cn.xuhweb.auth.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author xuh@fitme.ai
 * @date 2019/1/17 16:04
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDoRepository userDoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userDoRepository.findByUsername(username);
    }
}
