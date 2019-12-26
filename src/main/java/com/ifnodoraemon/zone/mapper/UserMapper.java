package com.ifnodoraemon.zone.mapper;

import com.ifnodoraemon.zone.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ifnodoraemon
 */
@Mapper
public interface UserMapper {

    @Select(
        "SELECT id, username, password, email FROM user WHERE id=#{id}"
    )
    UserDO getUserById(@Param("id")Long id);

    @Select(
            "SELECT id, username, password, email FROM user WHERE username=#{username}"
    )
    UserDO getUserByUsername(@Param("username")String username);

    @Select(
            "SELECT id, username, password, email FROM user WHERE email=#{email}"
    )
    UserDO getUserByEmail(@Param("email")String email);

}
