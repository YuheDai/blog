package org.daiyuhe.blog.entity;

public class Tag {
    private String objectId;

    private String title;

    private int publishedArticleCount;

    public Tag(String objectId, String title, int publishedArticle) {
        this.objectId = objectId;
        this.title = title;
        this.publishedArticleCount = publishedArticle;
    }

    public Tag() {
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

    public int getPublishedArticleCount() {
        return publishedArticleCount;
    }

    public void setPublishedArticleCount(int publishedArticleCount) {
        this.publishedArticleCount = publishedArticleCount;
    }
}