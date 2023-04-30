package com.ls.backoffice.domain.mapper;

import com.ls.backoffice.controller.response.PostResponse;
import com.ls.backoffice.domain.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PostResponseMapper {
    public PostResponse apply(Post post){
        return Objects.isNull(post) ?
                null :
                PostResponse.builder()
                .postId(post.getPostId())
                .title(post.getTitle())
                .summary(post.getSummary())
                .tags(post.getTags())
                .content(post.getContent())
                .picture(post.getPicture())
                .createdBy(post.getCreatedBy())
                .publishedAt(post.getPublishedAt())
                .build();
    }
    public List<PostResponse> apply(List<Post> postList){
        return postList.stream()
                .map(this::apply)
                .toList();
    }
}
