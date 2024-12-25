package com.vitthal.blog_api.repository;

import com.vitthal.blog_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
