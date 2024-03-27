package com.example.studentp.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class RoleEnum {
    @Getter
    @AllArgsConstructor
    public enum Role{
        STUDENT,
        TEACHER,
        PARENTS
    }
}
