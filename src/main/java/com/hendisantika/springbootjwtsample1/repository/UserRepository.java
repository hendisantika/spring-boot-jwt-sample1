package com.hendisantika.springbootjwtsample1.repository;

import com.hendisantika.springbootjwtsample1.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:05
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends CrudRepository<User, String> {
}
