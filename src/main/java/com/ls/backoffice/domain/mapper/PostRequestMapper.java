package com.ls.backoffice.domain.mapper;

import com.ls.backoffice.controller.request.PostRequest;
import com.ls.backoffice.domain.model.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PostRequestMapper {
    public Post apply(PostRequest postRequest) {
        return Post.builder()
                .title(postRequest.getTitle())
                .summary(postRequest.getSummary())
                .tags(postRequest.getTags())
                .content(postRequest.getContent())
                .picture(postRequest.getPicture())
                .published(postRequest.getPublished())
                .createdBy(postRequest.getCreatedBy())
                .updatedBy(postRequest.getUpdatedBy())
                .deleted(postRequest.getDeleted())
                .build();
    }
    public Post apply(PostRequest postRequest, String postId) {
        return Post.builder()
                .postId(postId)
                .title(postRequest.getTitle())
                .summary(postRequest.getSummary())
                .tags(postRequest.getTags())
                .content(postRequest.getContent())
                .picture(postRequest.getPicture())
                .published(postRequest.getPublished())
                .createdBy(postRequest.getCreatedBy())
                .updatedBy(postRequest.getUpdatedBy())
                .deleted(postRequest.getDeleted())
                .build();
    }
}
