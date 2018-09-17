package com.blog.blog.service;

import com.blog.blog.models.Post;
import com.blog.blog.repositories.PostsRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {

    private PostsRepo postsRepo;


    public PostService(PostsRepo postsRepo) {
        this.postsRepo = postsRepo;
    }

    public Iterable<Post> findAll() {
        return postsRepo.findAll();
    }


    public Post save(Post post) {
        postsRepo.save(post);
        return post;
    }

    public Post findOne(long id) {
        return postsRepo.findOne(id);
    }

    public Post deactivateAd(long id, Post post) {

        postsRepo.findOne(id);
        postsRepo.save(post);
        return post;


    }

}