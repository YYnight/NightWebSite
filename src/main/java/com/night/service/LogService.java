package com.night.service;

import com.night.entity.Log;

import java.util.List;
import java.util.Map;

/**
 * Log的Service接口
 * @author dyoon
 * @Date 2017/11/10 16:26
 */
public interface LogService {
    /**
     * 根据日期月份分组查询
     */
    public List<Log> countList();
    /**
     * 分页查询日志
     * @return
     */
    public List<Log> list(Map<String,Object> map);


    /**
     * 通过Id查找实体
     * @param id
     * @return
     */
    public Log findById(Integer id);

    /**
     * 通过typeId查找日志
     */
    public List<Log> findLogsByLogTypeId(Integer id);
    /**
     * 通过id找到下一篇日志
     */
    public Log findLogByPreId(Map<String,Integer> map);
    /**
     * 通过Id找到前一篇日志
     */
    public Log findLogByNextId(Map<String,Integer> map);
}
