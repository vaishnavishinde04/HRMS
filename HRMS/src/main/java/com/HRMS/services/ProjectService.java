package com.HRMS.services;

import java.util.List;

import com.HRMS.model.ProjectMaster;

public interface ProjectService {

	List<ProjectMaster> getAllProjects();

	ProjectMaster getProjectById(int id);

	ProjectMaster addProject(ProjectMaster project);

	ProjectMaster updateProject(ProjectMaster project);

	void deleteProject(int id);

}
