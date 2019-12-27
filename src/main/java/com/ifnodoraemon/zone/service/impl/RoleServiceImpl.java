package com.ifnodoraemon.zone.service.impl;

import com.ifnodoraemon.zone.mapper.RoleMapper;
import com.ifnodoraemon.zone.model.RoleDO;
import com.ifnodoraemon.zone.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleServiceImpl implements RoleService {
    private RoleMapper roleMapper;


    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    //TODO
    @Override
    public List<RoleDO> listRolesByUserId(Long id) {
        List<RoleDO> roles = roleMapper.listRolesByUserId(id);
        return ToEmptyIfRolesIsNull(roles);
    }

    private List<RoleDO> ToEmptyIfRolesIsNull(List<RoleDO> roles){
        return null == roles ? new ArrayList<>() : roles;
    }
}
