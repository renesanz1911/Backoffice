package com.ls.backoffice.repository;

import com.ls.backoffice.domain.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPostRepository extends CrudRepository<Post, String> {
    List<Post> findAll();

}
