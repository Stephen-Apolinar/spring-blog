package com.blog.blog.repositories;

import com.blog.blog.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepo extends CrudRepository<Post, Long> {
}