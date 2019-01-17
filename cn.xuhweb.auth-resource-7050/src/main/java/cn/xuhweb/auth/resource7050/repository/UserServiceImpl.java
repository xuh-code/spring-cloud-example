package cn.xuhweb.auth.resource7050.repository;

import cn.xuhweb.auth.resource7050.entity.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDoRepository userDoRepository;

    @Override
    public UserDo create(String username, String password) {
        UserDo user = new UserDo();
        user.setUsername(username);
        password = "{bcrypt}" + passwordEncoder.encode(password);
        user.setPassword(password);
        UserDo u = userDoRepository.save(user);
        return u;
    }
}
