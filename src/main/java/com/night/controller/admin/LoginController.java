package com.night.controller.admin;

import com.night.entity.Blogger;
import com.night.service.BloggerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author dyoon
 * @Date 2017/11/15 16:26
 */
@Controller
@RequestMapping("/admin/login")
public class LoginController {

    @Resource private BloggerService bloggerService;

    @GetMapping
    public String loginPage(){
        return "/admin/login";
    }

    @PostMapping
    public ModelAndView login(String username, String password){
        ModelAndView mv = new ModelAndView();
        Blogger blogger = bloggerService.findBloggerByUserNameAndPassword(username,password);
        if(blogger==null){
            mv.addObject("error","用户名或密码错误");
            mv.setViewName("/admin/login");
        }else{
            mv.setViewName("/admin/main");
        }
        return mv;
    }
}
