package org.daiyuhe.blog.dao;

import org.daiyuhe.blog.entity.Archive;

import java.util.List;

public interface ArchiveDao {
    int insert(Archive archive);

    List<Archive> queryAll();

    int addArticleCount(int articleCount);
}