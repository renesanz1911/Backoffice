package com.ls.backoffice.controller;

import com.ls.backoffice.controller.request.PostRequest;
import com.ls.backoffice.controller.response.PostResponse;
import com.ls.backoffice.domain.mapper.PostRequestMapper;
import com.ls.backoffice.domain.mapper.PostResponseMapper;
import com.ls.backoffice.domain.model.Post;
import com.ls.backoffice.service.IPostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@Slf4j
public class PostsController {
    private IPostService postService;
    private PostResponseMapper postResponseMapper;
    private PostRequestMapper postRequestMapper;


    public PostsController(IPostService postService, PostResponseMapper postResponseMapper, PostRequestMapper postRequestMapper) {
        this.postService = postService;
        this.postResponseMapper = postResponseMapper;
        this.postRequestMapper = postRequestMapper;    }

    @GetMapping
    public List<PostResponse> getPosts(){
        log.info("GET request received: /posts");
        return postResponseMapper.apply(postService.getPosts());
    }
    @GetMapping("/{postId}")
    public PostResponse getPost(@PathVariable String postId ){
        return postResponseMapper.apply(postService.getPost(postId));
    }
    @PutMapping("/{postId}")
    public PostResponse updatePost(@PathVariable String postId, @RequestBody PostRequest request){
        return postResponseMapper.apply(
                postService.updatePost(
                        postRequestMapper.apply(
                                request,postId
                        )
                )
        );
    }
    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest request){
        return postResponseMapper.apply(postService.createpost(postRequestMapper.apply(request)));
    }
    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable String postId){
        postService.deletePost(postId);
    }
}
