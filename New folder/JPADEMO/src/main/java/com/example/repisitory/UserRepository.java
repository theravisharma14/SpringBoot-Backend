package com.example.repisitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.record.UserRecord;    
public interface UserRepository extends JpaRepository<UserRecord, Integer>   
{    
}    