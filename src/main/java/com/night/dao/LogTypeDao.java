package com.night.dao;

import com.night.entity.LogType;

import java.util.List;

/**
 * 日志类型Dao
 * @author dyoon
 * @Date 2017/11/10 15:58
 */
public interface LogTypeDao {

    /**
     * 查询所有日志类型，以及对应的日志数量
     */
    public List<LogType> findAll();

    /**
     * 通过id查询博客类型
     */
    public LogType findById(Integer id);
}
