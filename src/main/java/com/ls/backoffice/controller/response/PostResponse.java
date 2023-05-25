package com.ls.backoffice.controller.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PostResponse {
    private String postId;//NOSONAR
    private String title;//NOSONAR
    private String summary;//NOSONAR
    private String tags;//NOSONAR
    private String content;//NOSONAR
    private String picture;//NOSONAR
    private String createdBy;//NOSONAR
    private LocalDateTime publishedAt;//NOSONAR
}
