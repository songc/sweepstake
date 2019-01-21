package com.cmbc.sweepstake.controller;

import com.cmbc.sweepstake.dao.UserDAO;
import com.cmbc.sweepstake.entity.User;
import com.cmbc.sweepstake.service.SweepstakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/sweepstake")
public class SweepstakeController {

    private SweepstakeService sweepstakeService;
    private UserDAO userDAO;


    @Autowired
    public SweepstakeController(SweepstakeService sweepstakeService, UserDAO userDAO) {
        this.sweepstakeService = sweepstakeService;
        this.userDAO = userDAO;
    }

    @GetMapping
    public List<User> sweepstake(@RequestParam Integer num) throws Exception {
        return sweepstakeService.sweepstake(userDAO.findAll(), num);
    }
}
