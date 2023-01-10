package com.hendisantika.springbootjwtsample1.util;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:06
 * To change this template use File | Settings | File Templates.
 */
@Component
public class JwtUtil {

    private static final String SECRET_KEY = "learn_programming_yourself";

    private static final int TOKEN_VALIDITY = 3600 * 5;
}
