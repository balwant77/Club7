package com.Club7.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String  message) {
        super(message);
    }

}
