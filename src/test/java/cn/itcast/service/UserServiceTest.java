package cn.itcast.service;

import cn.itcast.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.Date;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void queryUserList() {
    }

    @Test
    public void addUsers() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserService userService = (IUserService) ac.getBean("userServiceImpl");
        User user1 = new User();
        user1.setName("用户1");
        user1.setPassword("123456");
        user1.setUserName("admin1");
        user1.setAge(18);
        user1.setSex(1);
        user1.setBirthday(new Date());
        User user2 = new User();
        user2.setName("用户2");
        user2.setPassword("123456");
        user2.setUserName("admin2");
        user2.setAge(18);
        user2.setSex(1);
        user2.setBirthday(new Date());

        userService.addUsers(user1, user2);
    }
}