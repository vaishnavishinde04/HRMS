package com.HRMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.InterviewMaster;
import com.HRMS.services.InterviewService;

@RestController
public class InterviewController {
	
	@Autowired
	private InterviewService interviewService;
	
	@GetMapping("/interview")
	public List<InterviewMaster> getallinterview()
	{
		List<InterviewMaster> getallinterview = this.interviewService.getallinterview();
		return getallinterview;
	}
	
	@GetMapping("/interview/{id}")
	public Optional<InterviewMaster> getinterview(@PathVariable("id") int id)
	{
		Optional<InterviewMaster> getinterview = this.interviewService.getinterview(id);
		return getinterview;
	}
	
	@PostMapping("/interview")
	public InterviewMaster addinterview(@RequestBody InterviewMaster interviewMaster)
	{
		InterviewMaster addinterview = this.interviewService.addinterview(interviewMaster);
		return addinterview;
	}
	
	@PutMapping("/interview/{id}")
	public InterviewMaster updateinterview(@RequestBody InterviewMaster interviewMaster,@PathVariable("id") int id)
	{
		InterviewMaster updateinterview = this.interviewService.updateinterview(interviewMaster,id);
		return updateinterview;
	}
	
	@DeleteMapping("/interview/{id}")
	public void deleteinterview(@PathVariable("id") int id)
	{
		this.interviewService.deleteinterview(id);
	}
	
	
	
	
	
}
