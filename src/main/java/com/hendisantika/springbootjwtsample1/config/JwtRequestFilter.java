package com.hendisantika.springbootjwtsample1.config;

import com.hendisantika.springbootjwtsample1.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:09
 * To change this template use File | Settings | File Templates.
 */
@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private JwtService jwtService;
}
