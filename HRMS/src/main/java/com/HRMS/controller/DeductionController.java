package com.HRMS.controller;

import java.util.List;

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

import com.HRMS.model.DeductionMaster;
import com.HRMS.services.DeductionService;

@RestController
public class DeductionController {

	@Autowired
	private DeductionService dedcutionservice;

	@GetMapping("/deduction")
	public ResponseEntity<List<DeductionMaster>> getAllDeduction() {
		List<DeductionMaster> getDeduction = this.dedcutionservice.getAllDeduction();
		if (getDeduction.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getDeduction);
	}

	@GetMapping("/deduction/{deductionId}")
	public ResponseEntity<DeductionMaster> getDeductionById(@PathVariable("deductionId") int deductionId) {
		DeductionMaster getDeductionById = dedcutionservice.getDeductionById(deductionId);
		;
		if (getDeductionById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getDeductionById);

	}

	@PostMapping("/deduction")
	public ResponseEntity<DeductionMaster> addDeduction(@RequestBody DeductionMaster deduction) {
		try {
			DeductionMaster addedDeduction = dedcutionservice.addDeduction(deduction);
			return ResponseEntity.ok().body(addedDeduction);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/deduction/{deductionId}")
	public ResponseEntity<DeductionMaster> updatededuction(@RequestBody DeductionMaster deduction,
			@PathVariable("deductionId") int deductionId) {

		DeductionMaster getdeductionbyid = dedcutionservice.getDeductionById(deductionId);
		;
		if (getdeductionbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		try {
			DeductionMaster updatedBook = dedcutionservice.updateDeduction(deduction);
			return ResponseEntity.ok().body(updatedBook);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/deduction/{deductionId}")
	public ResponseEntity<Void> deletededuction(@PathVariable("deductionId") int deductionId) {

		DeductionMaster getdeductionbyid = dedcutionservice.getDeductionById(deductionId);
		;
		if (getdeductionbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		try {
			dedcutionservice.deleteDeduction(deductionId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}
