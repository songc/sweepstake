package com.cmbc.sweepstake.dao;

import com.cmbc.sweepstake.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
