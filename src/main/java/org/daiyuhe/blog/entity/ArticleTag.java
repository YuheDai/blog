package org.daiyuhe.blog.entity;

public class ArticleTag {
    private String objectId;

    private String articleId;

    private String tagId;

    public ArticleTag(String objectId, String articleId, String tagId) {
        this.objectId = objectId;
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public ArticleTag() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }
}