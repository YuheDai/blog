package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Article;
import org.daiyuhe.blog.entity.CategoryTag;

import java.util.List;

public interface CategoryTagDao {

    List<Article> queryArticleByCategoryId(String categoryId);

    int deleteTagByTagId(String tagId);

    int insert(CategoryTag categoryTag);

}