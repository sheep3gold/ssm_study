package cn.itcast.service;

import cn.itcast.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> queryUserList();

    /**
     * 测试事务
     * @param user1
     * @param user2
     */
    void addUsers(User user1, User user2);

    void deleteUserById(Long id);
}

