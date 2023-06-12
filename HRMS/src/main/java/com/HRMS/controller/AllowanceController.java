package com.HRMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@RestController
@CrossOrigin(origins="*")
public class AllowanceController {

	@Autowired
	private AllowanceService allowanceService; //runtme object creation

	@GetMapping("/allowances")
	public ResponseEntity<List<AllowanceMaster>> getAllAllowances() {
		List<AllowanceMaster> allAllowances = allowanceService.getAllAllowances();

		if (allAllowances.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allAllowances));
	}

	@GetMapping("/allowances/{id}")
	public ResponseEntity<AllowanceMaster> getAllowanceById(@PathVariable("id") int id) {
		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);

		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(allowanceById);
	}

	@PostMapping("/allowances")
	public ResponseEntity<AllowanceMaster> addAllowance(@RequestBody AllowanceMaster allowance) {
		try {
			AllowanceMaster addedAllowance = allowanceService.addAllowance(allowance);
			return ResponseEntity.ok().body(addedAllowance);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/allowances/{id}")
	public ResponseEntity<AllowanceMaster> updateAllowance(@PathVariable("id") int allowanceID,@RequestBody AllowanceMaster allowance) {
		
		int id = allowanceID;
		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);
		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		try {
			allowance.setAllowanceId(allowanceID);
			AllowanceMaster updatedAllowance = allowanceService.updateAllowance(allowance);
			return ResponseEntity.ok().body(updatedAllowance);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/allowances/{id}")
	public ResponseEntity<Void> deleteAllowance(@PathVariable("id") int id) {
		
		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);
		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			this.allowanceService.deleteAllowance(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
