package com.hendisantika.springbootjwtsample1.service;

import com.hendisantika.springbootjwtsample1.entity.Role;
import com.hendisantika.springbootjwtsample1.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/12/23
 * Time: 06:39
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
