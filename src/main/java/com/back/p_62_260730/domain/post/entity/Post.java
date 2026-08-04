package com.back.p_62_260730.domain.post.entity;

import com.back.p_62_260730.global.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter // 어노테이션. 표식(자바, 프레임워크, IDE)
@Entity
@NoArgsConstructor
public class Post extends BaseEntity {

    private String title; // varchar(255)
    private String body; // varchar(255)

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void modify(String title, String body) {
        this.title = title;
        this.body = body;
    }

}
