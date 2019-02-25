package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Article;
import org.daiyuhe.blog.entity.ArticleTag;

import java.util.List;

public interface ArticleTagDao {

    List<Article> queryArticleByTagId(String tagId);

    int deleteByArticleAndTagId(String articleId, String tagId);

    int deleteByArticleId(String articleId);

    int deleteByTagId(String articleId);

    int insert(ArticleTag articleTag);
}