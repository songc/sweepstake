package com.cmbc.sweepstake.controller;

import com.cmbc.sweepstake.dao.UserDAO;
import com.cmbc.sweepstake.entity.User;
import com.cmbc.sweepstake.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController(value = "/user")
public class UserController {
    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @PostMapping(value = "register")
    public User register(@RequestBody User user) {
        return userDAO.save(user);
    }

    @PostMapping(value = "/test/register")
    public List<User> genUser(@RequestParam Integer num) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setEmployeeId(RandomUtil.randEmployeeId());
            user.setName(RandomUtil.randName());
            user.setPhone(RandomUtil.randPhone());
            userList.add(user);
        }
        return userDAO.save(userList);
    }

    @DeleteMapping(value = "/test")
    public String delete() {
        userDAO.deleteAll();
        return "Success delete all";
    }
}
