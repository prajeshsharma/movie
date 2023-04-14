package cogent.infotech.com.service;

import cogent.infotech.com.entity.Admin;
import cogent.infotech.com.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminDetailsService implements UserDetailsService {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin a = adminRepository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(a.getUsername(), a.getPassword(), new ArrayList<>());
    }
}
