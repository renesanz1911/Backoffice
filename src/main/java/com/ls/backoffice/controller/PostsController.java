package com.ls.backoffice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @GetMapping
    public String getPosts(){
        return "Estos son los posts";
    }
    @GetMapping("/{postId}")
    public String getPost(@PathVariable("postId") String postId){
        return String.format("Este es el post %s",postId);
    }
}
