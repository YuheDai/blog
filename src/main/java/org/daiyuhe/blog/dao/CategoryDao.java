package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.Category;

import java.util.List;

public interface CategoryDao {

    Category queryById(String objectId);

    List<Category> queryAll();

    int insert(Category category);

    int updateUrlById(@Param("objectId") String objectId, @Param("url") String url);

    int updateTitleById(@Param("objectId")String objectId, @Param("title")String title);

    int incTagCount();
}