package com.lzh.dao;

import com.lzh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    // 根据Id查询用户
    User queryUserById(@Param("id") int id) ;
}
