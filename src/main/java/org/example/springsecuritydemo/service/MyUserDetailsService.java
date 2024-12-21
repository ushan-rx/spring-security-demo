package org.example.springsecuritydemo.service;

import org.example.springsecuritydemo.dao.UserRepo;
import org.example.springsecuritydemo.model.User;
import org.example.springsecuritydemo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if(user == null){
            System.out.println("user 404");
            throw new UsernameNotFoundException("user 404");
        }
        return new UserPrincipal(user);
    }
}
