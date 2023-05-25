package com.ls.backoffice.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")//generacioin de ID.
    private String postId;//NOSONAR
    private String title;//NOSONAR
    private String summary;//NOSONAR
    private String tags;//NOSONAR
    private String content;//NOSONAR
    private String picture;//NOSONAR
    private Boolean published;//NOSONAR
    private String createdBy;//NOSONAR
    private LocalDateTime createdAt;//NOSONAR
    private String updatedBy;//NOSONAR
    private LocalDateTime updatedAt;//NOSONAR
    private LocalDateTime publishedAt;//NOSONAR
    private Boolean deleted;//NOSONAR
}
