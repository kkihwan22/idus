package com.example.idus.members.domain;

import lombok.Getter;

public enum Gender {
    MALE("m"), FEMALE("f"), NONE("")
    ;

    @Getter
    private String code;

    Gender(String code) {
        this.code = code;
    }
}
