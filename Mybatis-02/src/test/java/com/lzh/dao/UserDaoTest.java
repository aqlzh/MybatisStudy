package com.lzh.dao;

import com.lzh.pojo.User;
import com.lzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class UserDaoTest {

    // 提升作用域
    static Logger logger = Logger.getLogger(UserDaoTest.class);

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
    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

//        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        HashMap<String,Integer> map = new HashMap<String,Integer>() ;
        map.put("startIndex",0);
        map.put("pageSize",1);
        List<User> userList = userDao.getUserByLimit(map) ;
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }

@Test
    public void test(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
    UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定

    User userByID = userDao.getUserById(1);
    System.out.println(userByID);

    sqlSession.commit();
    sqlSession.close() ;  // 固定

}

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        UserDao userDao = sqlSession.getMapper(UserDao.class);    //固定
//
//        User userByID = userDao.getUserById(1);
//        System.out.println(userByID);

        userDao.deleteUser(2) ;
        sqlSession.commit();
        sqlSession.close() ;  // 固定

    }
}
