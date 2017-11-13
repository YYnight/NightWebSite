package com.night.controller;

import com.night.entity.Log;
import com.night.entity.LogType;
import com.night.service.LogService;
import com.night.service.LogTypeService;
import com.sun.deploy.net.HttpResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dyoon
 * @Date 2017/11/10 15:42
 */
@Controller
@RequestMapping("/log")
public class LogController {

    @Resource private LogService logService;
    @Resource private LogTypeService logTypeService;

    @RequestMapping
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        List<LogType> logTypeList = logTypeService.findAll();
        List<Log> logList = logService.list(new HashMap<String,Object>());
        for (Log log : logList) {
            List<String> imageList = log.getImageList();
            String blogInfo = log.getContent();
            Document doc = Jsoup.parse(blogInfo);
            Elements jpgs = doc.select("img[src$=.jpg]"); //　查找扩展名是jpg的图片
            for (int i = 0; i < jpgs.size(); i++) {
                Element jpg = jpgs.get(i);
                imageList.add(jpg.toString());
                if (i == 2) {
                    break;
                }
            }
        }
        mv.addObject("logList",logList);
        mv.addObject("logTypeList",logTypeList);
        mv.setViewName("/log/list");
        return mv;
    }
    @RequestMapping(value="/findAll",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String findAll(){
        List<Log> logs = logService.list(new HashMap<String,Object>());
        return JSONArray.fromObject(logs).toString();
    }

    @RequestMapping(value="/findLogById",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String findLogById(@RequestParam("id") Integer id, HttpServletResponse response){
        Log log = logService.findById(id);
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("id",log.getId());
        log.setLastLog(logService.findLogByNextId(map));
        log.setNextLog(logService.findLogByPreId(map));
        JSONObject jsonObject = JSONObject.fromObject(log);
        return jsonObject.toString();
    }

    @RequestMapping(value="/findLogsByLogTypeId",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public ResponseEntity findLogByLogTypeId(@RequestParam("ltid")Integer ltid){
        List<Log> logs = logService.findLogsByLogTypeId(ltid);
        JSONArray jsonArray = JSONArray.fromObject(logs);
        return ResponseEntity.status(HttpStatus.OK).body(jsonArray.toString());
    }

    @RequestMapping(value = "/search",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String search(@RequestParam("keyWord")String keyWord){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("keyWord",keyWord);
        List<Log> logs = logService.list(map);
        return JSONArray.fromObject(logs).toString();
    }

}
