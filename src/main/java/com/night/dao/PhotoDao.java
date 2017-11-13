package com.night.dao;

import com.night.entity.Photo;

import java.util.List;

/**
 * Pthoto的数据层
 * @author dyoon
 * @Date 2017/11/13 10:44
 */
public interface PhotoDao {
    public List<Photo> findAll();
}
