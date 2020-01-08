package com.offcn.jap.service;

import com.offcn.jap.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface UserService extends JpaRepository<User, Integer> {
}
