package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Comment;

import java.util.List;

public interface CommentDao {

    Comment queryById(String objectId);

    List<Comment> queryAll();

    List<Comment> queryByArticleId(String articleId);

    List<Comment> queryByOriginalId(String originalId);

    int deleteById(String objectId);

    int insert(Comment comment);

}