package com.hendisantika.springbootjwtsample1.repository;

import com.hendisantika.springbootjwtsample1.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:04
 * To change this template use File | Settings | File Templates.
 */
public interface RoleRepository extends CrudRepository<Role, String> {
}
