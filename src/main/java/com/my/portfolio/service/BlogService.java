package com.my.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.portfolio.model.Blog;
import com.my.portfolio.repository.BlogRepository;

@Service
public class BlogService {
    
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog>getAllBlogs(){
        return blogRepository.findAll();
    }
    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }
    public void deleteBlog(Long blogId){
        blogRepository.deleteById(blogId);
    }

}
