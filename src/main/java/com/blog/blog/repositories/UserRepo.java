package com.blog.blog.repositories;

import com.blog.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Post, Long> {
}
