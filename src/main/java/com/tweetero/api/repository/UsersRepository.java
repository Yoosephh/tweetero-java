package com.tweetero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetero.api.models.UserModel;

@Repository
public interface UsersRepository extends JpaRepository<UserModel, Long> {
  
}
