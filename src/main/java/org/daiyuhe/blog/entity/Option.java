package org.daiyuhe.blog.entity;

public class Option {
    private String objectId;

    private String optionValue;

    private String optionCategory;

    public Option(String objectId, String optionValue, String optionCategory) {
        this.objectId = objectId;
        this.optionValue = optionValue;
        this.optionCategory = optionCategory;
    }

    public Option() {
        super();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    public String getOptionCategory() {
        return optionCategory;
    }

    public void setOptionCategory(String optionCategory) {
        this.optionCategory = optionCategory == null ? null : optionCategory.trim();
    }
}