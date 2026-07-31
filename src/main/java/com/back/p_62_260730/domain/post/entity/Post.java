package com.back.p_62_260730.domain.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@RequiredArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int
    private final String title; // varchar(255)
    private final String body; // varchar(255)

    public Post() {
        title = "";
        body = "";
    }
}
