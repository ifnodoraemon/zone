package com.ifnodoraemon.zone.service.impl;

import com.ifnodoraemon.zone.model.RoleDO;
import com.ifnodoraemon.zone.model.UserDO;
import com.ifnodoraemon.zone.service.RoleService;
import com.ifnodoraemon.zone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifnodoraemon
 */
@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {
    private UserService userService;
    private RoleService roleService;


    @Autowired
    public MyUserDetailsServiceImpl(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDO userDO = userService.getUserByUsername(username);
        List<RoleDO> roles = roleService.listRolesByUserId(userDO.getId());
        userDO.setAuthorities(roles);

        return userDO;
    }


}
