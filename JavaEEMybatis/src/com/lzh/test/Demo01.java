package com.lzh.test;

import com.lzh.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo01 {


        @Test
        public void test1() throws IOException {
//        a)读取配置文件；
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

            //b)通过SqlSessionFactoryBuilder创建SqlSessionFactory会话工厂。
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

            // c)通过SqlSessionFactory创建SqlSession。
            SqlSession session = sessionFactory.openSession();

//        d)调用SqlSession的操作数据库方法。
            //查询一条结果
            User user = session.selectOne("findUserById",10);      //报错
            System.out.println(user);

            String s;
            //查询多条结果
            List<User> users = session.selectList("findUserByName","张");
            System.out.println(users);
//        关闭SqlSession。
            session.commit();
        }
}
