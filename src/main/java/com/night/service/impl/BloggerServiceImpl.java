package com.night.service.impl;

import com.night.dao.BloggerDao;
import com.night.entity.Blogger;
import com.night.service.BloggerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author dyoon
 * @Date 2017/11/16 10:11
 */
@Service
@Transactional
public class BloggerServiceImpl implements BloggerService {

    @Resource private BloggerDao bloggerDao;
    public Blogger findBloggerByUserNameAndPassword(String userName, String password) {
        return bloggerDao.findBloggerByUserNameAndPassword(userName,password);
    }
}
