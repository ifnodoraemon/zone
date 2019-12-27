package com.ifnodoraemon.zone.service;

import com.ifnodoraemon.zone.model.UserDO;
import org.springframework.stereotype.Service;

/**
 * @author ifnodoraemon
 */
public interface UserService {
    UserDO getUserByUsername(String username);

    UserDO getUserByEmail(String email);
}
