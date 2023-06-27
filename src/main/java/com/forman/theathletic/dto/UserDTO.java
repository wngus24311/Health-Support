package com.forman.theathletic.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserDTO {
    private int no;
    private String userid;
    private String username;
    private String password;
    private String sex;
    private String email;
    private String phone;
    private Date birth;
}
