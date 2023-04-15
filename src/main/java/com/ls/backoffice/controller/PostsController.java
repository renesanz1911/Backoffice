package com.ls.backoffice.controller;

import com.ls.backoffice.controller.response.PostResponse;
import com.ls.backoffice.domain.mapper.PostResponseMapper;
import com.ls.backoffice.domain.model.Post;
import com.ls.backoffice.service.IPostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
@Slf4j
public class PostsController {
    private IPostService postService;
    private PostResponseMapper postResponseMapper;


    public PostsController(IPostService postService, PostResponseMapper postResponseMapper) {
        this.postService = postService;
        this.postResponseMapper = postResponseMapper;
    }

    @GetMapping
    public List<PostResponse> getPosts(){
        log.info("GET request received: /posts");
        return postResponseMapper.apply(postService.getPosts());
    }
    @GetMapping("/{postId}")
    public String getPost(@PathVariable("postId") String postId){
        return String.format("Este es el post %s",postId);
    }
}
