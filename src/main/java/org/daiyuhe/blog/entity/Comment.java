package org.daiyuhe.blog.entity;

import java.util.Date;

public class Comment {
    private String objectId;

    private String content;

    private Date createTime;

    private String name;

    private String articleId;

    private String sharpUrl;

    private String avatar;

    private String originalId;

    private String originalName;

    public Comment(String objectId, String content, Date createTime, String name, String articleId, String sharpUrl, String avatar, String originalId, String originalName) {
        this.objectId = objectId;
        this.content = content;
        this.createTime = createTime;
        this.name = name;
        this.articleId = articleId;
        this.sharpUrl = sharpUrl;
        this.avatar = avatar;
        this.originalId = originalId;
        this.originalName = originalName;
    }

    public Comment() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getSharpUrl() {
        return sharpUrl;
    }

    public void setSharpUrl(String sharpUrl) {
        this.sharpUrl = sharpUrl == null ? null : sharpUrl.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId == null ? null : originalId.trim();
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }
}