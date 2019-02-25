package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.Option;

import java.util.List;

public interface OptionDao {

    int insert(Option option);

    Option queryById(String objectId);

    List<Option> queryByCategory(String optionCategory);

    int deleteById(String objectId);

    int updateById(@Param("objectId") String objectId, @Param("optionValue") String optionValue, @Param("optionCategory") String optionCategory);

    int updateValueById(@Param("objectId") String objectId, @Param("optionValue") String optionValue);

    int updateCategoryById(@Param("objectId") String objectId, @Param("optionCategory") String optionCategory);

}