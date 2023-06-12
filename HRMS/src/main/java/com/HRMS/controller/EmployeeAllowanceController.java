package com.HRMS.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import com.HRMS.model.EmployeeAllowance;
import com.HRMS.services.EmployeeAllowanceService;

@RestController
public class EmployeeAllowanceController {
	
	
	static Logger logger = LogManager.getLogger(EmployeeAllowanceController.class);

	@Autowired
	private EmployeeAllowanceService EAService;

	@GetMapping("/employeeallowance/{empid}")
	public ResponseEntity<List<EmployeeAllowance>> EmployeeAllAllowance(@PathVariable("empid") int empid) {
		List<EmployeeAllowance> employeeAllAllowance = this.EAService.EmployeeAllAllowance(empid);
		if (employeeAllAllowance.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(employeeAllAllowance);
	}

	@PostMapping("/employeeallowance")
	public ResponseEntity<EmployeeAllowance> assignallowance(@RequestBody EmployeeAllowance empallowance) {
		EmployeeAllowance assignallowance = this.EAService.assignallowance(empallowance);
		if (assignallowance == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(assignallowance);
	}

	@PutMapping("/employeeallowance")
	public ResponseEntity<EmployeeAllowance> updateallowance(@RequestBody EmployeeAllowance empallowance) {
		boolean checkEmployee = this.EAService.CheckEmployee(empallowance);
		if (checkEmployee == true) {
			try {
				EmployeeAllowance updateallowance = this.EAService.updateallowance(empallowance);
				return ResponseEntity.status(HttpStatus.OK).body(updateallowance);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/employeeallowance")
	public ResponseEntity<Void> deleteallowance(@RequestBody EmployeeAllowance empallowance) {

		boolean checkEmployee = this.EAService.CheckEmployee(empallowance);

		if (checkEmployee == true) {

			try {

				this.EAService.deleteallowance(empallowance);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
