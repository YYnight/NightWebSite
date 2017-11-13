package com.night.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dyoon
 * @Date 2017/11/13 14:31
 */
@Controller
@RequestMapping("/tellme")
public class MessageController {

    @RequestMapping
    public String index(){
        return "/message/message";
    }
}
