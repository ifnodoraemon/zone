package com.ifnodoraemon.zone.service;

import com.ifnodoraemon.zone.model.RoleDO;

import java.util.List;

public interface RoleService {
    List<RoleDO> listRolesByUserId(Long id);
}
