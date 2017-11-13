package com.night.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dyoon
 * @Date 2017/11/11 15:33
 */
public class Photograph implements Serializable {
    private static final long serialVersionUID = 1518213113065833774L;

    private Integer id;     //图片的id
    private String imageName;   //图片文件名称
    private String path;    //图片保存路径
    private Date uploadDate;    //上传日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
