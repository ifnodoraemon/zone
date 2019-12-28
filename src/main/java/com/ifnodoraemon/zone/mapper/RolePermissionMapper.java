package com.ifnodoraemon.zone.mapper;

import com.ifnodoraemon.zone.model.RolePermissionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ifnodoraemon
 */
@Mapper
@Component(value = "rolePermissionMapper")
public interface RolePermissionMapper {
    @Select({
            "SELECT role.name as role_name , permission.url as url FROM " +
                    " role JOIN role_permission ON role.id = role_permission.role_id " +
                    " JOIN permission ON role_permission.permission_id = permission.id "
    })
    @Results({
            @Result(property = "roleName", column = "role_name"),
            @Result(property = "url", column = "url")
    })
    List<RolePermissionDO> listAllRolePermissions();
}
