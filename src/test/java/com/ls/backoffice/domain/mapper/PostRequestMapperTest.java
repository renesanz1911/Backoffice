package com.ls.backoffice.domain.mapper;

import com.ls.backoffice.controller.request.PostRequest;
import com.ls.backoffice.domain.model.Post;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PostRequestMapperTest {

    PostRequestMapper postRequestMapper;
    PostRequest postRequest = PostRequest.builder()
            .title("title")
            .summary("summary")
            .tags("tags")
            .content("content")
            .picture("picture")
            .published(true)
            .createdBy("pepito")
            .updatedBy("juanito")
            .deleted(false)
            .build();
    Post expected = Post.builder()
            .title("title")
            .summary("summary")
            .tags("tags")
            .content("content")
            .picture("picture")
            .published(true)
            .createdBy("pepito")
            .updatedBy("juanito")
            .deleted(false)
            .build();

    @BeforeEach
    void setUp() {
        postRequestMapper = new PostRequestMapper();
    }

    @Test
    void apply() {
        Post result = postRequestMapper.apply(postRequest);
        assertTrue(EqualsBuilder.reflectionEquals(expected, result));
    }
}