package org.daiyuhe.blog.entity;

public class Category {
    private String objectId;

    private String title;

    private String url;

    private int tagCount;

    public Category(String objectId, String title, String url, int tagCount) {
        this.objectId = objectId;
        this.title = title;
        this.url = url;
        this.tagCount = tagCount;
    }

    public Category() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public int getTagCount() {
        return tagCount;
    }

    public void setTagCount(int tagCount) {
        this.tagCount = tagCount;
    }
}