package com.night.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dyoon
 * @Date 2017/11/11 16:46
 */
@Controller
@RequestMapping("/photo")
public class PhotoContoller {

    @RequestMapping
    public String list(){
        return "/photo/photo";
    }
}
