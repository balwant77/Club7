package com.Club7.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {

    private long id;
    private String username;
    private String emailId;
    private String password;
    private long mobile;

}
