package com.Club7.Service;


import com.Club7.Entity.UserRegistration;
import com.Club7.Exception.UserNotFoundException;
import com.Club7.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired

    private UserRepository userRepository;
    public UserRegistration saveData(UserRegistration userRegistration){
        UserRegistration save = userRepository.save(userRegistration);
        return save;

    }
    public UserRegistration getById(Long id) throws UserNotFoundException {
        Optional<UserRegistration> byId = userRepository.findById(id);
        if(byId.isPresent()){
            UserRegistration userRegistration = byId.get();

        return userRegistration;
    }else {
        throw new UserNotFoundException("User id" +id+ "is not found") ;
    }
    }
    @GetMapping("/allUsers")

    public List<UserRegistration> findAllUsers() {
        List<UserRegistration> allUser = userRepository.findAll();


        return allUser;
    }
}
