package com.my.portfolio.repository;
import com.my.portfolio.model.Project;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProjectRepository extends JpaRepository<Project ,Long> {

}
