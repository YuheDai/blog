package org.daiyuhe.blog.entity;

import java.util.List;

public class ArticleArchive {
    private String objectId;

    private String articleId;

    private String archiveId;

    public ArticleArchive(String objectId, String articleId, String archiveId) {
        this.objectId = objectId;
        this.articleId = articleId;
        this.archiveId = archiveId;
    }

    public ArticleArchive() {
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

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId == null ? null : archiveId.trim();
    }
}