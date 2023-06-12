package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.ProjectDAO;
import com.HRMS.model.ProjectMaster;
import com.HRMS.services.ProjectService;


@Service
public class ProjectImpl implements ProjectService {
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectImpl.class);
	
    @Autowired
    private ProjectDAO projectDAO;
	
    
    
	@Override
	public List<ProjectMaster> getAllProjects() {
		 try {
				return (List<ProjectMaster>) projectDAO.findAll();
			} catch (Exception e) {
				logger.error("Error getting all Projects: {}", e.getMessage());
				e.printStackTrace();
				throw new RuntimeException("Failed to get all Projects", e);
			}
	}

	@Override
	public ProjectMaster getProjectById(int id) {
         try {
        	 ProjectMaster project =projectDAO.findById(id);
        	 if(project != null) {
        		 return project;
        	 }
        	 return null;
		} catch (Exception e) {
			logger.error("Error getting project with ID {}: {}", id, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get project by ID", e);
		}		
		
	}

	@Override
	public ProjectMaster addProject(ProjectMaster project) {
		try {
			return projectDAO.save(project);
		} catch (Exception e) {
			logger.error("Error saving project: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save project", e);
		}
	}

	@Override
	public ProjectMaster updateProject(ProjectMaster project) {
		try {
			return projectDAO.save(project);
		} catch (Exception e) {
			logger.error("Error saving project: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save project", e);
		}
	}

	@Override
	public void deleteProject(int id) {
		try {
			this.projectDAO.deleteById(id);
		} catch (Exception e) {
			logger.error("Error deleting project with id " + id, e);
			e.printStackTrace();
			throw new RuntimeException("Error deleting project with id " + id, e);
		}		
	}

}
