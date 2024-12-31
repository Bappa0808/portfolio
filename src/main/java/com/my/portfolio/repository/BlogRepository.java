package com.my.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.portfolio.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {

}
