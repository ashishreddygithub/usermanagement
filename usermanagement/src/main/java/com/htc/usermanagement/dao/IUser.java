package com.htc.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.htc.usermanagement.entity.User;

@Service
public interface IUser extends JpaRepository<User,Long>  {

}
