package com.hendisantika.springbootjwtsample1.service;

import com.hendisantika.springbootjwtsample1.repository.UserRepository;
import com.hendisantika.springbootjwtsample1.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
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
}
