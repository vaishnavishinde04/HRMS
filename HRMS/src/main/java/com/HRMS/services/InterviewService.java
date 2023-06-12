package com.HRMS.services;

import java.util.List;
import java.util.Optional;

import com.HRMS.model.InterviewMaster;

public interface InterviewService {

	List<InterviewMaster> getallinterview();

	Optional<InterviewMaster> getinterview(int id);

	InterviewMaster addinterview(InterviewMaster interviewMaster);

	InterviewMaster updateinterview(InterviewMaster interviewMaster, int id);

	void deleteinterview(int id);
	

}
