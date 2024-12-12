package com.example.user;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserVO {
    private int id;
    private String userid;
    private String password;
    private String username;
    private Timestamp regdate;
}
