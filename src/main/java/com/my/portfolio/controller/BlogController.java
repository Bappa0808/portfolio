package com.my.portfolio.controller;

import com.my.portfolio.model.Blog;
import com.my.portfolio.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    // Get all blogs
    @GetMapping("/blogs")
    public String getAllBlogs(Model model) {
        List<Blog> blogs = blogService.getAllBlogs();
        model.addAttribute("blogs", blogs);
        return "blogs"; // Thymeleaf template
    }

    // Post a blog
    @PostMapping("/blogs/add")
    public String postBlog(@RequestParam("title") String title,
                           @RequestParam("description") String description,
                           @RequestParam(value = "image", required = false) MultipartFile image) throws IOException {
        Blog blog = new Blog();
        blog.setBlogTitle(title);
        blog.setBlogDescription(description);
        blogService.saveBlog(blog);
        return "redirect:/blogs"; // Redirect to the list of blogs
    }

    // Delete a blog
    @PostMapping("/blog/delete/{id}")
    public String deleteBlog(@PathVariable Long id) {
            blogService.deleteBlog(id);
            return "redirect:/blogs";
    }
}
