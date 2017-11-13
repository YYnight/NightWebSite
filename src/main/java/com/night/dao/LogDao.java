package com.night.dao;

import com.night.entity.Log;

import java.util.List;
import java.util.Map;

/**
 * 日志Dao接口
 * @author dyoon
 * @Date 2017/11/10 15:44
 */
public interface LogDao {
    /**
     * 根据日期月份分组查询
     */
    public List<Log> findLogsGroupByDate();

    /**
     * 分页查询博客
     */
    public List<Log> findAll(Map<String,Object> params);

    /**
     * 根据Id查找日志
     */
    public Log findById(Integer id);
    /**
     * 根据LogType的Id查找日志（同一分类的日志）
     */
    public List<Log> findLogsByLogTypeId(Integer id);
    /**
     * 根据Id查找下一篇日志
     */
    public Log findLogByPreId(Map<String,Integer> map);
    /**
     * 根据Id查找上一篇日志
     */
    public Log findLogByNextId(Map<String,Integer> map);

}
