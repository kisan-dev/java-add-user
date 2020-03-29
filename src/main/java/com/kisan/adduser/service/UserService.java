package com.kisan.adduser.service;

import com.kisan.adduser.db.User;
import com.kisan.adduser.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User addNewUser(User user){
        return userRepo.save(user);
    }
}
