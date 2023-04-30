package com.ls.backoffice.controller.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PostResponse {
    private String postId;
    private String title;
    private String summary;
    private String tags;
    private String content;
    private String picture;
    private String createdBy;
    private LocalDateTime publishedAt;
}
