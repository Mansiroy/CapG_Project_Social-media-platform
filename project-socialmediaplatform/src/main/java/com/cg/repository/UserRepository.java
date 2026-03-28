package com.cg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    // optional - just added
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}