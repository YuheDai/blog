package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.Option;

public interface OptionDao {

    int insert(Option option);

    int deleteById(String objectId);

    int updateOptionValueById(@Param("objectId") String objectId, @Param("optionValue") String optionValue);

    int updateOptionCategoryById(@Param("objectId") String objectId, @Param("optionCategory") String optionCategory);

    int updateById(@Param("objectId") String objectId, @Param("optionValue") String optionValue, @Param("optionCategory") String optionCategory);

}