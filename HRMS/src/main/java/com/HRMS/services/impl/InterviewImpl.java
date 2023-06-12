package com.HRMS.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.InterviewDAO;
import com.HRMS.model.InterviewMaster;
import com.HRMS.services.InterviewService;

@Service
public class InterviewImpl implements InterviewService {
	
	@Autowired
	private InterviewDAO interviewDAO;

	@Override
	public List<InterviewMaster> getallinterview() {
		List<InterviewMaster> allinterview = (List<InterviewMaster>) this.interviewDAO.findAll();
		return allinterview;
	}

	@Override
	public Optional<InterviewMaster> getinterview(int id) {
		Optional<InterviewMaster> interview = this.interviewDAO.findById(id);
		return interview;
	}

	@Override
	public InterviewMaster addinterview(InterviewMaster interviewMaster) {
		InterviewMaster save = this.interviewDAO.save(interviewMaster);
		return save;
	}

	@Override
	public InterviewMaster updateinterview(InterviewMaster interviewMaster, int id) {
		interviewMaster.setInterview_id(id);
		InterviewMaster save = this.interviewDAO.save(interviewMaster);
		return save;
	}

	@Override
	public void deleteinterview(int id) {
		this.interviewDAO.deleteById(id);
		
	}
}
