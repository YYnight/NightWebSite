package com.night.controller;

import com.night.entity.Photo;
import com.night.service.PhotoService;
import org.springframework.stereotype.Controller;
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

    @RequestMapping
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        List<Photo> photoList = photoService.findAll();
        mv.addObject("photoList",photoList);
        mv.setViewName("/photo/photos");
        return mv;
    }

    @RequestMapping("/findAllPhotograph")
    public ModelAndView findPhotographsByPhotoId(@RequestParam("id") Integer id){
        return null;
    }
}
