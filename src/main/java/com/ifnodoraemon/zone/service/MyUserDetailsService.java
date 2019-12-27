package com.ifnodoraemon.zone.service;

import com.ifnodoraemon.zone.mapper.RoleMapper;
import com.ifnodoraemon.zone.mapper.UserMapper;
import com.ifnodoraemon.zone.model.RoleDO;
import com.ifnodoraemon.zone.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class MyUserDetailsService implements UserDetailsService {
    private UserService userService;
    private RoleService roleService;


    @Autowired
    public MyUserDetailsService(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDO userDO = userService.getUserByUsername(username);
        List<RoleDO> roles= roleService.listRolesByUserId(userDO.getId());
        userDO.setAuthorities(roles);

        return userDO;
    }


}
