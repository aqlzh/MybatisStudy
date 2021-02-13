package com.lzh.mapper;

import com.lzh.model.User;
import com.lzh.vo.UserQueryVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     *
     * @param user
     * @return 受影响的行数
     */
    //@Insert("INSERT INTO user (username,sex,birthday,address) VALUE (#{username},#{sex},#{birthday},#{address})")
    public int save(User user);

    //@Select("SELECT * FROM user WHERE id = #{id}")
    public User findUserById(int id);

    public List<User> findUserByUserQueryVo(UserQueryVO vo);


    public List<User> findUserByMap(Map<String, Object> map);
}
