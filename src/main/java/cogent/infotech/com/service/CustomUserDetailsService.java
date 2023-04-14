package cogent.infotech.com.service;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(u.getUsername(), u.getPassword(), new ArrayList<>());
    }


}
