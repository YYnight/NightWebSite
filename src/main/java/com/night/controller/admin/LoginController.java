package com.night.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dyoon
 * @Date 2017/11/15 16:26
 */
@Controller
@RequestMapping("/admin/login")
public class LoginController {

    @RequestMapping
    public String loginPage(){
        return "/admin/login";
    }
}
