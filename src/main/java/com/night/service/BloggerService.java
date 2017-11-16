package com.night.service;

import com.night.entity.Blogger;

/**
 * @author dyoon
 * @Date 2017/11/16 10:10
 */
public interface BloggerService {

    public Blogger findBloggerByUserNameAndPassword(String userName, String password);
}
