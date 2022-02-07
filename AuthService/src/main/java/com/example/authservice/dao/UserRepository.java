package com.example.authservice.dao;

import com.example.authservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
@Query(value="select * from User ",nativeQuery=true)
public List<User> getAllUser();
}
