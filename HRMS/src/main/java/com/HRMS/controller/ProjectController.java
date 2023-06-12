package com.HRMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.ProjectMaster;
import com.HRMS.services.ProjectService;

@RestController
public class ProjectController {
	@Autowired
    private ProjectService projectService;
	
	@GetMapping("/projects")
	public ResponseEntity<List<ProjectMaster>> getAllProjects(){
		List<ProjectMaster> allProjects = projectService.getAllProjects();
		
		if(allProjects.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allProjects));
	}
	
	@GetMapping("/project/{id}")
	public ResponseEntity<ProjectMaster> getProjectById(@PathVariable("id")int id){
		ProjectMaster projectById= projectService.getProjectById(id);
		
		if(projectById == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(projectById);
	}
	
	@PostMapping("/project")
	public ResponseEntity<ProjectMaster> addProject(@RequestBody ProjectMaster project){
		try {
			ProjectMaster addedProject = projectService.addProject(project);
			return ResponseEntity.ok().body(addedProject);
		}catch(Exception e){
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	}
	
	@PutMapping("project")
	public ResponseEntity<ProjectMaster> updateProject(@RequestBody ProjectMaster project){
		int id = project.getProject_Id();
		ProjectMaster projectById = projectService.getProjectById(id);
		if(projectById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try {
			ProjectMaster updatedProject=projectService.updateProject(project);
			return ResponseEntity.ok().body(updatedProject);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("/project/{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable("id") int id) {
		
		ProjectMaster projectById = projectService.getProjectById(id);
		if (projectById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			this.projectService.deleteProject(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}
