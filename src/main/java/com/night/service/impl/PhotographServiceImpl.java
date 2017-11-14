package com.night.service.impl;

import com.night.dao.PhotographDao;
import com.night.entity.Photo;
import com.night.entity.Photograph;
import com.night.service.PhotoService;
import com.night.service.PhotographService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/14 9:25
 */
@Service
@Transactional
public class PhotographServiceImpl implements PhotographService {
    @Resource
    private PhotographDao photographDao;

    public List<Photograph> findByPhotoId(Integer id) {
        return photographDao.findByPhotoId(id);
    }
}