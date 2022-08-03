package com.example.idus.members.domain;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Member {
    private Long id;
    private String name;
    private String nickname;
    private String password;
    private String email;
    private Gender gender;
}