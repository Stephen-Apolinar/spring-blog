package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    List<Post> posts = new ArrayList<>();

    public PostController() {

        posts.add(new Post("one", "post number one"));
        posts.add(new Post("two", "this is the second post"));
        posts.add(new Post("three", "here's the third post"));

    }
    //  Bundled together individual post and many post viewing to the same url
    @GetMapping("/posts")
    public String index(Model viewModel){
        viewModel.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show ( @PathVariable long id, Model viewModel){
        Post post = posts.get((int) id - 1);
        viewModel.addAttribute("post", post);
        return "posts/show";

    }

    //    Has unnecessary functionality for testing query strings
    @GetMapping("/posts/create")
    @ResponseBody
    private String createPostForm(){
        return "This will be the create posts form <br>Here's a form for testing /posts<br><form action = '/posts' method = 'GET'><input type='text' name ='id'><button>Submit</button></form>";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    private String createPost(){
        return "This will be where new posts are created";
    }
}