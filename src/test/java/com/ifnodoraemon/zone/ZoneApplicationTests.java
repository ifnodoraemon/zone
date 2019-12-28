package com.ifnodoraemon.zone;

import com.ifnodoraemon.zone.mapper.UserMapper;
import com.ifnodoraemon.zone.mapper.RolePermissionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class ZoneApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getUserById(){
        System.out.println(userMapper.getUserById(1l));
    }

    @Test
    void listAllRolePermissions(){
        System.out.println(rolePermissionMapper.listAllRolePermissions());
    }

}
