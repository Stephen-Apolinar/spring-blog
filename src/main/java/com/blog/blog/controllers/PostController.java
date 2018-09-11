package com.blog.blog.controllers;

import com.blog.blog.Post;
import com.blog.blog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }



    @GetMapping("/posts/{id}")
    public String showAd(@PathVariable int id, Model model){
        Post post = postService.findOne(id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts")
    public String showAllAds(Model model){
        model.addAttribute("posts", postService.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/create")
    private String createPostForm(Model model){

        model.addAttribute("post", new Post());

        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String insertPost(@ModelAttribute Post post){
        postService.save(post);
        return "redirect:/posts";
    }
}