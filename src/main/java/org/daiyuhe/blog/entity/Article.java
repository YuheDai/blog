package org.daiyuhe.blog.entity;

import java.util.Date;

public class Article {
    private String objectId;

    private String title;

    private String abstracts;

    private String content;

    private String tags;

    private String authorId;

    private int commentCount;

    private int viewCount;

    private String permalink;

    private Boolean isPublished;

    private Boolean isTop;

    private Date createTime;

    private Date updateTime;

    private Boolean commentable;

    private String viewPassword;

    public Article(String objectId, String title, String abstracts, String content, String tags, String authorId, int commentCount, int viewCount, String permalink, Boolean isPublished, Boolean isTop, Date createTime, Date updateTime, Boolean commentable, String viewPassword) {
        this.objectId = objectId;
        this.title = title;
        this.abstracts = abstracts;
        this.content = content;
        this.tags = tags;
        this.authorId = authorId;
        this.commentCount = commentCount;
        this.viewCount = viewCount;
        this.permalink = permalink;
        this.isPublished = isPublished;
        this.isTop = isTop;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.commentable = commentable;
        this.viewPassword = viewPassword;
    }

    public Article() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink == null ? null : permalink.trim();
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getCommentable() {
        return commentable;
    }

    public void setCommentable(Boolean commentable) {
        this.commentable = commentable;
    }

    public String getViewPassword() {
        return viewPassword;
    }

    public void setViewPassword(String viewPassword) {
        this.viewPassword = viewPassword == null ? null : viewPassword.trim();
    }
}