package com.back.p_62_260730.domain.post.post.service;

import com.back.p_62_260730.domain.post.member.entity.Member;
import com.back.p_62_260730.domain.post.post.entity.Post;
import com.back.p_62_260730.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post write(Member author, String title, String body) {
        Post post = new Post(author, title, body);
        return postRepository.save(post);
    }

    public void modify(Post post, String title, String body) {
        post.modify(title, body);
    }

    public void delete(Post post) {
        postRepository.delete(post);
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id); // 트랜잭션 시작 -> select * from post -> 트랜잭션 종료 -> 커밋
    }

    public long count() {
        return postRepository.count();
    }
}
