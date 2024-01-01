package com.example.movieappback.repository;
import org.springframework.stereotype.Repository;
import com.example.movieappback.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
