package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Comment;

import java.util.List;

public interface CommentDao {

    Comment queryById(String objectId);

    List<Comment> queryAll();

    int deleteById(String objectId);

    int insert(Comment comment);

}