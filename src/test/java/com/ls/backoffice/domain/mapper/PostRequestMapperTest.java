package com.ls.backoffice.domain.mapper;

import com.ls.backoffice.controller.request.PostRequest;
import com.ls.backoffice.domain.model.Post;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PostRequestMapperTest {
    @InjectMocks
    public PostRequestMapper postRequestMapper;
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

    @Test
    public void testApply() {
        Post result = postRequestMapper.apply(postRequest);
        assertEquals(expected, result);
    }

}