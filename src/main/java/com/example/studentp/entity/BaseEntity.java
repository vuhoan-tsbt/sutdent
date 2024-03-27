package com.example.studentp.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class BaseEntity {
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer createBy;

    private Integer updateBy;
}
