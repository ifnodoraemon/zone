package com.ifnodoraemon.zone.controller;

import com.ifnodoraemon.zone.model.UserDO;
import com.ifnodoraemon.zone.model.UserVO;
import com.ifnodoraemon.zone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ifnodoraemon
 */
@Controller
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public UserVO getUserById(@PathVariable(value = "username") String username){
        paramIsNullOrEmpty(username);
        return getUserVOByUsername(username);
    }

    //TODO
    private Long StingIdToBigIntId(String id){
        return 1L;
    }

    //TODO
    private void paramIsNullOrEmpty(String param){

    }

    //TODO
    private UserVO getUserVOByUsername(String username){
        return null;
    }


}
