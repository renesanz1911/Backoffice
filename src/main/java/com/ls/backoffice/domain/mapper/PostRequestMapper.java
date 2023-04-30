package com.ls.backoffice.domain.mapper;

import com.ls.backoffice.controller.request.PostRequest;
import com.ls.backoffice.domain.model.Post;
import com.ls.backoffice.exception.MissingRequiredFieldException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class PostRequestMapper {
    public Post apply(PostRequest postRequest) {
        return Post.builder()
                .title(Optional.ofNullable(postRequest.getTitle()).orElseThrow(()->new MissingRequiredFieldException("El campo titulo es obligatorio", "title")))
                .summary(postRequest.getSummary())
                .tags(postRequest.getTags())
                .content(Optional.ofNullable(postRequest.getContent()).orElseThrow(()->new MissingRequiredFieldException("El campo contenido es obligatorio", "content")))
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
