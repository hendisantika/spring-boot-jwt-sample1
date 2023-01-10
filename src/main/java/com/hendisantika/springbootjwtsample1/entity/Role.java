package com.hendisantika.springbootjwtsample1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/11/23
 * Time: 06:01
 * To change this template use File | Settings | File Templates.
 */
@Data
@Entity
public class Role {
    @Id
    private String roleName;
    private String roleDescription;
}
