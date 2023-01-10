package com.hendisantika.springbootjwtsample1.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 05:59
 * To change this template use File | Settings | File Templates.
 */
@Data
public class JwtRequest {
    private String userName;
    private String userPassword;
}
