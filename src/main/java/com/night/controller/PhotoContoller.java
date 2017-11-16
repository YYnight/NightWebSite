package com.night.controller;

import com.night.entity.PageBean;
import com.night.entity.Photo;
import com.night.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/11 16:46
 */
@Controller
@RequestMapping("/photo")
public class PhotoContoller {

    @Resource private PhotoService photoService;

    @GetMapping("{page}")
    public ModelAndView list(@PathVariable(value = "page",required = false)Integer page){
        ModelAndView mv = new ModelAndView();
        if(page==null||page==0){
            page=1;
        }
        PageBean<Photo> pageBean = photoService.findByPage(page);
        mv.addObject("pageBean",pageBean);
        mv.setViewName("/photo/photos");
        return mv;
    }
//    public String list(){
//        return "/photo/photo";
//    }

    @RequestMapping("/findAllPhotograph")
    public ModelAndView findPhotographsByPhotoId(@RequestParam("id") Integer id){
        return null;
    }
}
