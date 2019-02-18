package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.Tag;

import java.util.List;

public interface TagDao {

    Tag queryById(String objectId);

    Tag queryByTitle(String title);

    List<Tag> queryAll();

    int addPublishedArticleCntById(@Param("objectId") String objectId, @Param("publishedArticleCount") int publishedArticleCount);

    int deleteById(String objectId);

    int deleteByTitle(String title);

    int insert(Tag tag);
}