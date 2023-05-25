package com.ls.backoffice.controller.request;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
public class PostRequest {
    private String title;//NOSONAR
    private String summary;//NOSONAR
    private String tags;//NOSONAR
    private String content;//NOSONAR
    private String picture;//NOSONAR
    private Boolean published;//NOSONAR
    private String createdBy;//NOSONAR
    private String updatedBy;//NOSONAR
    private Boolean deleted;//NOSONAR
}
