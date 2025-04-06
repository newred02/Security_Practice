package com.example.springsecutiry.service;

import com.example.springsecutiry.dto.CustomUserDetails;
import com.example.springsecutiry.entity.User;
import com.example.springsecutiry.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userData = userRepository.findByUsername(username);

        if(userData != null) {
            return new CustomUserDetails(userData); //UserDetails에 담아서 return하면 AutneticationManager가 검증 함
        }

        return null;
    }
}
