package com.cmbc.sweepstake.service.impl;

import com.cmbc.sweepstake.entity.User;
import com.cmbc.sweepstake.service.SweepstakeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SweepstakeServiceImpl implements SweepstakeService {
    @Override
    public List<User> sweepstake(List<User> userList, int num) throws Exception {
        if (num > userList.size()) {
            throw new Exception();
        } else if (num == userList.size()) {
            return userList;
        }

        List<User> result = new ArrayList<>();
        List<User> temp = new ArrayList<>(userList);
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(temp.size());
            result.add(temp.get(index));
            temp.remove(index);
        }
        return result;
    }
}
