package com.hendisantika.springbootjwtsample1.service;

import com.hendisantika.springbootjwtsample1.dto.JwtRequest;
import com.hendisantika.springbootjwtsample1.dto.JwtResponse;
import com.hendisantika.springbootjwtsample1.entity.User;
import com.hendisantika.springbootjwtsample1.repository.UserRepository;
import com.hendisantika.springbootjwtsample1.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/12/23
 * Time: 06:37
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class JwtService implements UserDetailsService {

    private final JwtUtil jwtUtil;

    private final UserRepository userRepository;

    private final AuthenticationManager authenticationManager;

    public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception {
        String userName = jwtRequest.getUserName();
        String userPassword = jwtRequest.getUserPassword();
        authenticate(userName, userPassword);

        UserDetails userDetails = loadUserByUsername(userName);
        String newGeneratedToken = jwtUtil.generateToken(userDetails);

        User user = userRepository.findById(userName).get();
        return new JwtResponse(user, newGeneratedToken);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findById(username).get();

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(),
                    user.getUserPassword(),
                    getAuthority(user)
            );
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
