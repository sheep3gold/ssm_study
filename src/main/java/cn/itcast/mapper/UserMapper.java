package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    User queryUserById(Long id);

    List<User> queryUserList();

    void addUser(User user);

    void deleteUserById(Long id);
}
