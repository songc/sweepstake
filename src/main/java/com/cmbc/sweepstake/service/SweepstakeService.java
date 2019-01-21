package com.cmbc.sweepstake.service;

import com.cmbc.sweepstake.entity.User;

import java.util.List;

public interface SweepstakeService {
    List<User> sweepstake(List<User> userList, int num) throws Exception;
}
