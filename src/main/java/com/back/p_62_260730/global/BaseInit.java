package com.back.p_62_260730.global;

import com.back.p_62_260730.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration // 빈 등록용
@RequiredArgsConstructor
public class BaseInit {

    private final PostService postService;

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("초기화 작업을 수행합니다.");
            work1();
            work2();
        };
    }

    // jpa -> jakarta, Transactional은 spring 패키지 사용
    @Transactional
    void work1() {

        if(postService.count() > 0) {
            return;
        }

        postService.write("제목1", "내용1");
        postService.write("제목2", "내용2");

    }

    @Transactional
    void work2() {
        postService.findById(1);
        // select * from post where id = 1;
    }
}
