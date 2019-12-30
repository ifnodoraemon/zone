package com.ifnodoraemon.zone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ifnodoraemon
 * @date 2019-12-28 11:55
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
