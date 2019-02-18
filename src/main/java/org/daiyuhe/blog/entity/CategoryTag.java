package org.daiyuhe.blog.entity;

public class CategoryTag {
    private String objectId;

    private String categoryId;

    private String tagId;

    public CategoryTag(String objectId, String categoryId, String tagId) {
        this.objectId = objectId;
        this.categoryId = categoryId;
        this.tagId = tagId;
    }

    public CategoryTag() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }
}