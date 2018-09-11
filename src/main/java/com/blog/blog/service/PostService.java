package com.blog.blog.service;

import com.blog.blog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> allPosts;

    public PostService(){
        allPosts = new ArrayList<>();
        createPosts();
    }


    public List<Post> findAll(){

        return allPosts;
    }

    public Post findOne(int id){

        return allPosts.get(id - 1);
    }

    private void createPosts(){

        save(new Post("Post number one", "This is the first post"));
        save(new Post("Post number dos", "second post"));
        save(new Post("Three", "333333333333333"));
        save(new Post("Number four", "this is the last post rn"));

    }

    public void save(Post post){
        post.setId(allPosts.size() + 1);
        allPosts.add(post);
    }





}