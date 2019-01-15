package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("users")
    public String toUsers(Model model) {

        List<User> users = userService.queryUserList();
        model.addAttribute("users", users);
        return "users";
    }
    @RequestMapping("deleteUserById")
    public String saveUser(@RequestParam("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/user/users";//删除后重新发送请求查询最新数据
    }
}
