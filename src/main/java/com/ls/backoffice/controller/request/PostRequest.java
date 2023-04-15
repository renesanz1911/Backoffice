package com.ls.backoffice.controller.request;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PostRequest {
    private String title;
    private String summary;
    private String tags;
    private String content;
    private String picture;
    private Boolean published;
    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
}
