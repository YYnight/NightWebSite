package com.night.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * 相册实体
 * @author dyoon
 * @Date 2017/11/11 15:32
 */
public class Photo implements Serializable {
    private static final long serialVersionUID = -1998759337010221668L;

    private String name;    //相册名称
    private List<Photograph> photographs;   //存储的照片
    private String description;     //相册描述
    private Date createDate;        //创建日期

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Photograph> getPhotographs() {
        return photographs;
    }

    public void setPhotographs(List<Photograph> photographs) {
        this.photographs = photographs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
