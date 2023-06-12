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

import com.HRMS.model.DesignationMaster;
import com.HRMS.services.DesignationService;

@RestController
public class DesignationController {

	@Autowired
	private DesignationService designationservice;

	@GetMapping("/designation")
	public ResponseEntity<List<DesignationMaster>> getDesignation() {
		
		List<DesignationMaster> alldesignation = designationservice.getAllDesigantion();
		if (alldesignation.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(alldesignation));
	}

	@GetMapping("/designation/{designationId}")
	public ResponseEntity<DesignationMaster> getDesigantion(@PathVariable("designationId") int designationId) {
		
		DesignationMaster designationbyid = designationservice.getDesigantionById(designationId);
		if (designationbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(designationbyid);

	}

	@PostMapping("/designation")
	public ResponseEntity<DesignationMaster> addDesigantion(@RequestBody DesignationMaster designation) {
		try {
			DesignationMaster addedDesigantion = this.designationservice.addDesigantion(designation);
			return ResponseEntity.ok().body(addedDesigantion);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("designation")
	public ResponseEntity<DesignationMaster> updatedesignation(@RequestBody DesignationMaster designation)
	 {
		int designationId=designation.getDesignationId();
		DesignationMaster designationbyid = designationservice.getDesigantionById(designationId);
		if (designationbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			DesignationMaster designation1 = designationservice.updateDesigantion(designation);
			return ResponseEntity.ok().body(designation1);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/designation/{designationId}")
	public ResponseEntity<Void> deletedesignation(@PathVariable("designationId") int designationId) {
		
		DesignationMaster designationbyid = designationservice.getDesigantionById(designationId);
		if (designationbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			this.designationservice.deleteDesigantion(designationId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
