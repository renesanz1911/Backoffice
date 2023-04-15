package com.ls.backoffice.service;

import com.ls.backoffice.domain.model.Post;
import com.ls.backoffice.repository.IPostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostService implements IPostService {
    @Autowired
    private IPostRepository postRepository;

    @Override
    public List<Post> getPosts() {
        log.info("getting all posts");
        return postRepository.findAll();
    }
}
