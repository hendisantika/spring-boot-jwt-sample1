package com.hendisantika.springbootjwtsample1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:00
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor
public class JwtResponse {
    private user;
    private String jwtToken;
}
