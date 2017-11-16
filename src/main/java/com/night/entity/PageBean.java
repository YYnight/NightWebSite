package com.night.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dyoon
 * @Date 2017/11/16 16:13
 */
public class PageBean<T extends Serializable>{

    private Integer pageNow = 1;
    private Integer pageSize = 6;
    private Long totalCount;
    private List<T> beans = new ArrayList<T>();
    private Integer totalPageCount;
    private boolean hasNext;
    private boolean hasPre;

    public PageBean() {
    }

    public PageBean(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public PageBean(Integer pageNow, Integer pageSize) {
        this.pageNow = pageNow;
        this.pageSize = pageSize;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        this.totalPageCount = ((totalCount.intValue()-1)/pageSize)+1;
        this.hasNext = totalPageCount==pageNow?false:true;
        this.hasPre = pageNow == 1?false:true;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public boolean isHasPre() {
        return hasPre;
    }

    public List<T> getBeans() {
        return beans;
    }

    public void setBeans(List<T> beans) {
        this.beans = beans;
    }
}
