package com.night.dao;

import com.night.entity.Blogger;
import org.apache.ibatis.annotations.Param;

/**
 * @author dyoon
 * @Date 2017/11/16 9:56
 */
public interface BloggerDao {
    /**
     * 根据用户名和密码查询博主
     */
    public Blogger findBloggerByUserNameAndPassword(@Param("userName") String userName,@Param("password")String password);
}
