package com.lzh.dao;

import com.lzh.pojo.User;
import com.lzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        //方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }


        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close() ;  // 固定
    }


    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        int res= userDao.addUser(new User(4,"小小","123"));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        int res= userDao.updateUser(new User(3,"学生","890"));

        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        int res= userDao.deleteUser(4);

        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }


    // 模糊查询
    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        List<User> userList= userDao.getUserLike("某");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }
}
