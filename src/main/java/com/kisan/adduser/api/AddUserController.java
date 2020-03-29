package com.kisan.adduser.api;

import com.kisan.adduser.db.User;
import com.kisan.adduser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "Welcome";
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addNewUser(@RequestBody User newUser) throws Exception{
        User savedUser =  userService.addNewUser(newUser);
        return new ResponseEntity<>(savedUser , HttpStatus.OK);
    }

}
