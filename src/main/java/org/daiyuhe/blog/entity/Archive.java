package org.daiyuhe.blog.entity;

import java.util.Date;

/**
 * @author DaiYuHe
 */
public class Archive {
    private String objectId;

    private int articleCount;

    private Date archiveDate;

    public Archive(String objectId, int articleCount, Date archiveDate) {
        this.objectId = objectId;
        this.articleCount = articleCount;
        this.archiveDate = archiveDate;
    }

    public Archive() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public Date getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
    }
}