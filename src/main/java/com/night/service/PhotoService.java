package com.night.service;

import com.night.entity.PageBean;
import com.night.entity.Photo;

import java.util.List;

/**
 * Photo的业务逻辑层接口
 * @author dyoon
 * @Date 2017/11/13 10:54
 */
public interface PhotoService {
    /**
     * 查询所有的相册
     * @return
     */
    public List<Photo> findAll();

    /**
     * 分页查询相册
     */
    public PageBean<Photo> findByPage(Integer page);
}
