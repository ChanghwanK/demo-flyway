package com.example.demoflyway.web.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created by Bloo
 * @Date: 2021/08/05
 */


public interface UserRepository extends JpaRepository<User, Long> {

}
