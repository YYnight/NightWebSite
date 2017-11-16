package com.night.dao;

import com.night.entity.Photo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Pthoto的数据层
 * @author dyoon
 * @Date 2017/11/13 10:44
 */
public interface PhotoDao {
    public List<Photo> findAll();

    public Long findCount();

    public List<Photo> findByPage(@Param("startPos") Integer startPos, @Param("pageSize") Integer pageSize);
}
