package com.blog.blog.repositories;

import com.blog.blog.models.Post;
import com.blog.blog.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Post, Long> {
    User findById(long id);

    User findByUsername(String name);

    void save(User user);
}
