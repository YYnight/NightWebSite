package com.night.service;

import com.night.entity.Photograph;

import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/14 9:25
 */
public interface PhotographService {
    public List<Photograph> findByPhotoId(Integer id);
}
