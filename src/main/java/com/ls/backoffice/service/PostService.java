package com.ls.backoffice.service;

import com.ls.backoffice.domain.model.Post;
import com.ls.backoffice.exception.NotExistByIdExeption;
import com.ls.backoffice.repository.IPostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Post getPost(String postId) {
        log.info("getting post by Id");
        return postRepository.findById(postId)
                .orElseThrow(()->new NotExistByIdExeption("El post solicitado no existe"));

    }

    @Override
    public Post updatePost(Post post) {
        if (postRepository.existsById(post.getPostId())) {
            return postRepository.save(post);
        }
        else{
            throw new NotExistByIdExeption("El post solicitado no existe");
        }
    }

    @Override
    public Post createpost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePost(String postId) {
        if (postRepository.existsById(postId)) {
            postRepository.deleteById(postId);
        }
        else{
            throw new NotExistByIdExeption("El post solicitado no existe");
        }
    }
}
