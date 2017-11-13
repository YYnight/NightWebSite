package com.night.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 日志实体类
 * @author dyoon
 * @Date 2017/11/10 15:31
 */
public class Log implements Serializable{
    private static final long serialVersionUID = -8984532267853475562L;

    private Integer id;  //编号
    private String title; //主题
    private String summary; //摘要
    private Date publishedDate; //发布日期
    private Integer readedNum; //阅读量
    private Integer commentNum;   //评论数
    private String content; //日志内容
    private String contentNoTag;    //日志内容 无网页标签  Lucene分词用
    private LogType logType;       //日志类型
    private Integer blogNum;    //日志数量 非日志实际属性 主要是 根据发布日期归档查询日志数量用
    private String keyWord; //关键字 空格隔开
    private List<String> imageList = new LinkedList<String>(); //日志里存在的图片  主要用于列表展示缩略图
    private Log lastLog;  //前一篇日志
    private Log nextLog;  //后一篇日志

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Integer getReadedNum() {
        return readedNum;
    }

    public void setReadedNum(Integer readedNum) {
        this.readedNum = readedNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentNoTag() {
        return contentNoTag;
    }

    public void setContentNoTag(String contentNoTag) {
        this.contentNoTag = contentNoTag;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public Integer getBlogNum() {
        return blogNum;
    }

    public void setBlogNum(Integer blogNum) {
        this.blogNum = blogNum;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public Log getLastLog() {
        return lastLog;
    }

    public void setLastLog(Log lastLog) {
        this.lastLog = lastLog;
    }

    public Log getNextLog() {
        return nextLog;
    }

    public void setNextLog(Log nextLog) {
        this.nextLog = nextLog;
    }
}
