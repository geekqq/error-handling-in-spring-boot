package com.javatechie.validationdemo.repository;

import com.javatechie.validationdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
