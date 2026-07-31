package com.back.p_62_260730.domain.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int
    private String title; // varchar(255)
    private String body; // varchar(255)
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
        this.createDate = LocalDateTime.now();
        this.modifyDate = createDate;
    }

}
