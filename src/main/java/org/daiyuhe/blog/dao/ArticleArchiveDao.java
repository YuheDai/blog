package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Article;
import org.daiyuhe.blog.entity.ArticleArchive;

import java.util.List;

public interface ArticleArchiveDao {

    int deleteByArticleId(String articleId);

    int insert(ArticleArchive articleArchive);

    List<Article> queryArticleByArchiveId(String archiveId);

}