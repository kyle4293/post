package com.example.post.repository;

import com.example.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    // Query Methods: 메서드 이름으로 SQL을 생성(Select * ~)
    List<Post> findAllByOrderByModifiedAtDesc();

}