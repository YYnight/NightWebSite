package com.night.service.impl;

import com.night.dao.PhotoDao;
import com.night.entity.PageBean;
import com.night.entity.Photo;
import com.night.service.PhotoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/13 10:55
 */
@Service
@Transactional
public class PhotoServiceImpl implements PhotoService {
    @Resource private PhotoDao photoDao;
    public List<Photo> findAll() {
        return photoDao.findAll();
    }

    public PageBean<Photo> findByPage(Integer page) {
        PageBean<Photo> pageBean = new PageBean<Photo>(page);
        pageBean.setTotalCount(photoDao.findCount());
        pageBean.setBeans(photoDao.findByPage(pageBean.getPageSize()*(pageBean.getPageNow()-1),pageBean.getPageSize()));
        return pageBean;
    }
}
