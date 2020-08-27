package com.setoyan.geekbrainsspring.persist.repo;

import com.setoyan.geekbrainsspring.persist.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    
    User findByUserName(String userName);
}
