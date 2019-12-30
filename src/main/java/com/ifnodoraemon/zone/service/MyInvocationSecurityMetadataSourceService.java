package com.ifnodoraemon.zone.service;

import com.ifnodoraemon.zone.model.RolePermissionDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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

        HttpServletRequest request = ((FilterInvocation) o).getHttpRequest();
        for (String url : map.keySet()) {
            if (new AntPathRequestMatcher(url).matches(request)) {
                return map.get(url);
            }
        }

        return Collections.emptyList();
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return Collections.emptyList();
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    private void loadResourceDefine() {
        map = new HashMap<>(16);
        List<RolePermissionDO> rolePermissions = rolePermissionService.listAllRolePermissions();

        for (RolePermissionDO rolePermissionDO : rolePermissions){
            String url = rolePermissionDO.getUrl();
            String roleName = rolePermissionDO.getRoleName();
            ConfigAttribute role = new SecurityConfig(roleName);

            if (map.containsKey(url)){
                map.get(url).add(role);
            }else {
                List<ConfigAttribute> list = new ArrayList<>();
                list.add(role);
                map.put(url, list);
            }
        }
    }
}
