package com.night.dao;

import com.night.entity.Photograph;

import java.util.List;

/**
 * Photograph 数据层
 * @author dyoon
 * @Date 2017/11/13 11:25
 */
public interface PhotographDao {
    /**
     * 根据photoId查询photograph
     * @param photoId
     * @return
     */
    public List<Photograph> findByPhotoId(Integer photoId);
}
