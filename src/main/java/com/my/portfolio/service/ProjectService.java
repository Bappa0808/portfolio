package com.my.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.portfolio.model.Project;
import com.my.portfolio.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project>getAllProjects(){
        return projectRepository.findAll();
    }
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }


}
