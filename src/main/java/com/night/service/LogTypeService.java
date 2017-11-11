package com.night.service;

import com.night.entity.LogType;

import java.util.List;

/**
 * Log类型的Service接口
 * @author dyoon
 * @Date 2017/11/10 16:29
 */
public interface LogTypeService {
    /**
     * 查询所有日志类型，以及对应的日志数量
     */
    public List<LogType> findAll();
}
