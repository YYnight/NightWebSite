package com.night.controller;

import com.night.entity.Photograph;
import com.night.service.PhotographService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/14 9:24
 */
@Controller
@RequestMapping("/photograph")
public class PhotographController {
    @Resource private PhotographService photographService;

    @RequestMapping("/findByPhotoId")
    public ModelAndView findByPhotoId(@RequestParam Integer id){
        ModelAndView mv = new ModelAndView();
        List<Photograph> photographList = photographService.findByPhotoId(id);
        mv.addObject("photographList",photographList);
        mv.setViewName("/photo/photographlist");
        return mv;
    }
}
