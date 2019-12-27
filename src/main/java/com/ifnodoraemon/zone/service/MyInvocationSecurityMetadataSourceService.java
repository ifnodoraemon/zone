package com.ifnodoraemon.zone.service;

import com.ifnodoraemon.zone.model.RolePermission;
import com.ifnodoraemon.zone.model.RolePermissionDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MyInvocationSecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {
    private PermissionService permissionService;
    private RolePermissionService rolePermissionService;

    private static HashMap<String, Collection<ConfigAttribute>> map = null;

    @Autowired
    public void setPermissionService(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    public void setRolePermissionService(RolePermissionService rolePermissionService) {
        this.rolePermissionService = rolePermissionService;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        if ( null == map ){
            loadResourceDefine();
        }
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    private void loadResourceDefine() {
        map = new HashMap<>(16);
        List<RolePermissionDO> rolePermissions = rolePermissionService.listAllRolePermissions();

        for (RolePermissionDO rolePermissionDO : rolePermissions){
            String url = rolePermissionDO
        }
    }
}
