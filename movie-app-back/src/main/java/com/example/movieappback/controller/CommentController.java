package com.example.movieappback.controller;

import com.example.movieappback.entity.Comment;
import com.example.movieappback.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:80")
@RequestMapping("")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    @PostMapping("/addcomment")
    public Comment createFavouriteMovie(@RequestBody Comment comment){
        return commentRepository.save(comment);
    }

}
