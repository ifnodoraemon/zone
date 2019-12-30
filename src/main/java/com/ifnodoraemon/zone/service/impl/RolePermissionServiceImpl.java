package com.ifnodoraemon.zone.service.impl;

import com.ifnodoraemon.zone.mapper.RolePermissionMapper;
import com.ifnodoraemon.zone.model.RolePermissionDO;
import com.ifnodoraemon.zone.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RolePermissionServiceImpl implements RolePermissionService {
    private RolePermissionMapper rolePermissionMapper;

    @Autowired
    public RolePermissionServiceImpl(RolePermissionMapper rolePermissionMapper) {
        this.rolePermissionMapper = rolePermissionMapper;
    }

    @Override
    public List<RolePermissionDO> listAllRolePermissions() {
        return rolePermissionMapper.listAllRolePermissions();
    }
}
