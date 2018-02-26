package com.soyoung.battle.ground.dao.db;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM user_info WHERE id = #{userId}")
    UserPo getUser(@Param("userId") Integer userId);
}
