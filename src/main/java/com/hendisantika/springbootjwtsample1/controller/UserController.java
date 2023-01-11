package com.hendisantika.springbootjwtsample1.controller;

import com.hendisantika.springbootjwtsample1.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/12/23
 * Time: 06:44
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }
}
