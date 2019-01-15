package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapper2Test {

    @Test
    public void queryUserById() {
        /*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.queryUserById(1l);
        System.out.println(user);*/
       /* ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = userMapper.queryUserById(1l);
        System.out.println(user);*/
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.queryUserById(1l);
        System.out.println(user);
    }
}