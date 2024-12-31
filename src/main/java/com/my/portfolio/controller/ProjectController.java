package com.my.portfolio.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.portfolio.model.Project;
import com.my.portfolio.service.ProjectService;

import org.springframework.ui.Model;



@Controller
public class ProjectController {
    


    @Autowired
    private ProjectService projectService;


    @GetMapping("/projects")
    public String getProjectPage(Model model) {
        List<Project>projects =projectService.getAllProjects();
        model.addAttribute("projects", projects);
        return "projects";// Maps to projects.html
    }
    @PostMapping("/projects/add")
    public String addProject(
                             @RequestParam String projectName,
                             @RequestParam String projectDescription,
                             @RequestParam String projectLink) {
        Project newProject = new Project(null,projectName, projectDescription, projectLink);
        projectService.saveProject(newProject);
        return "redirect:/projects";
    }

    @PostMapping("/projects/delete")
    public String deleteProject(@RequestParam Long projectId) {
        projectService.deleteProject(projectId);
        return "redirect:/projects";
    }


}
