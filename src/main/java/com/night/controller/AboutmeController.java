package com.night.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dyoon
 * @Date 2017/11/14 16:37
 */
@Controller
@RequestMapping("/aboutme")
public class AboutmeController {

    @RequestMapping
    public String aboutme(){
        return "/info/aboutme";
    }
}
