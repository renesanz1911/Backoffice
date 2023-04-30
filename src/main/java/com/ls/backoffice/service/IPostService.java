package com.ls.backoffice.service;

import com.ls.backoffice.domain.model.Post;

import java.util.List;
import java.util.Optional;

public interface IPostService {
    List<Post>getPosts();

    Post getPost(String postId);
    Post updatePost(Post post);
    Post createpost(Post post);
    void deletePost(String postId);
}
