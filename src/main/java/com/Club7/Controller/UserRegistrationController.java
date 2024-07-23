package com.Club7.Controller;
import com.Club7.Entity.UserRegistration;
import com.Club7.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")


public class UserRegistrationController {
    @Autowired
    private UserService userService;

    //http://localhost:3306/api/user
    @PostMapping("/user")

    public UserRegistration saveUserDetails(@RequestBody UserRegistration userRegistration) {
        UserRegistration userRegistration1 = userService.saveData(userRegistration);

        return userRegistration1 ;
    }
    //http://localhost:8080/api/id
    @GetMapping("/{id}")
   public UserRegistration getById(@PathVariable Long id){
        UserRegistration byId = userService.getById(id);
        return byId ;
    }
    @GetMapping("/allUsers")
    public List<UserRegistration> getAllUser(){
        List<UserRegistration> allUsers=userService.findAllUsers();
        return allUsers;
    }
//    public UserRegistration deleteById(){
//
//        return ;
//    }
//    public UserRegistration updateById(){
//
//        return ;
//    }



}
