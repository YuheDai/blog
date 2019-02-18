package org.daiyuhe.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.daiyuhe.blog.entity.User;

import java.util.List;

/**
 * @author DaiYuHe
 */
public interface UserDao {

    User queryById(String objectId);

    User queryByEmail(String email);

    List<User> queryAll();

    int insert(User user);

    int deleteByEmail(String email);

    int updatePasswordById(@Param("objectId") String objectId, @Param("password") String password);

    int updateAvatarById(@Param("objectId") String objectId, @Param("avatar") String avatar);

    int updateArticleCountById(@Param("objectId") String objectId, @Param("articleCount") int articleCount);
}