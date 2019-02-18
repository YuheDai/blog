package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.Article;

import java.util.List;

public interface ArticleDao {

    /**
     * 通过permalink查询文章.
     * @param permalink permalink
     * @return an article, returns{@code null}if not found
     */
    Article queryByPermalink(String permalink);

    /**
     * 根据索引查询文章.
     * @param offset the start
     * @param limit the end
     * @return a list of articles,index from offset to limit, returns an empty list if not found
     */
    List<Article> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过oId删除文章.
     * @param objectId oId
     * @return delete status
     */
    int deleteById(String objectId);

    int insert(Article article);

    int update(Article article);

    int updateIsTopById(@Param("objectId") String objectId, @Param("isTop") boolean isTop);

    int updateIsPublishedById(@Param("objectId") String objectId, @Param("isPublished") boolean isPublished);

    boolean isTop(String objectId);

    boolean isPublished(String objectId);

    int updateCommentableById(@Param("objectId") String objectId, @Param("commentable") boolean commentable);

    int updateViewPasswordById(@Param("objectId") String objectId, @Param("viewPassword") String viewPassword);

    int addCommentCountById(String objectId);

    int addViewCountById(String objectId);

}