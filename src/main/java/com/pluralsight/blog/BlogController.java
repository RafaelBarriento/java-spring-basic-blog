package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {

    private PostRepository postRepository;

    public BlogController(PostRepository post){
        postRepository = post;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap ){
        List<Post> listOfPost = postRepository.getAllPosts();
       // modelMap.put("title","Blog Post 1");
        modelMap.put("posts",listOfPost);
        return "home";
    }



}
