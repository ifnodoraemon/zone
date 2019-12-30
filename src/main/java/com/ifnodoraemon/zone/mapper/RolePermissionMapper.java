package com.ifnodoraemon.zone.mapper;

import com.ifnodoraemon.zone.model.RolePermissionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.checkerframework.checker.index.qual.SameLen;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "rolePermissionMapper")
public interface RolePermissionMapper {

    @Select({
            "SELECT role.name, permission.url" +
                    "FROM role " +
                    "JOIN role_permission ON role.id = role_permission.role_id " +
                    "JOIN permission ON role_permission.permission_id = permission.id"
    })
    List<RolePermissionDO> listAllRolePermissions();
}
