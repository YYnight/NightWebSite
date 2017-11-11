package com.night.entity;

import java.io.Serializable;

/**
 * 日志实体类
 * @author dyoon
 * @Date 2017/11/10 15:27
 */
public class LogType implements Serializable {
    private static final long serialVersionUID = 2527084643954561736L;
    private Integer id; //编号
    private String typeName; //日志类型名称
    private Integer blogCount; //数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getBlogCount() {
        return blogCount;
    }

    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }
}
