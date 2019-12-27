package com.ifnodoraemon.zone.mapper;

import com.ifnodoraemon.zone.model.RoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "roleMapper")
public interface RoleMapper {

    @Select({"SELECT id, name FROM ROLE WHERE id IN (" +
                "SELECT role_id FROM user_role WHERE user_id = #{userId}" +
            ")"})
    List<RoleDO> listRolesByUserId(@Param("userId") Long userId);
}
