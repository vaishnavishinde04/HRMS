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

import com.HRMS.model.DepartmentMaster;
import com.HRMS.services.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;

	
	@GetMapping("/department")
	public ResponseEntity<List<DepartmentMaster>> getAllDepartment() {
		List<DepartmentMaster> getalldepartment = this.departmentservice.getAllDepartment();
		if (getalldepartment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getalldepartment);
	}
	

	
	@GetMapping("/department/{departmentId}")
	public ResponseEntity<DepartmentMaster> findDepartmentById (@PathVariable("departmentId") int departmentId) {
		DepartmentMaster findDepartmentById = this.departmentservice.findDepartmentById(departmentId);
		if (findDepartmentById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(findDepartmentById);
	}
	
	

	@PostMapping("/department")
	public ResponseEntity<DepartmentMaster> adddepartment(@RequestBody DepartmentMaster department) {
		DepartmentMaster adddepartment = this.departmentservice.addDepartment(department);
		if (adddepartment == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().body(adddepartment);
	}
	

	@PutMapping("/department")
	public ResponseEntity<DepartmentMaster> updatedepartment(@RequestBody DepartmentMaster department) {
		
		int departmentId=department.getDepartment_id();
		DepartmentMaster finddepartmentbyid = this.departmentservice.findDepartmentById(departmentId);
		if (finddepartmentbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		DepartmentMaster updatedDepartment = this.departmentservice.updateDepartment(department);
		if (updatedDepartment == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().body(updatedDepartment);

	}

	@DeleteMapping("/department/{departmentId}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable("departmentId") int departmentId) {

		DepartmentMaster finddepartmentbyid = this.departmentservice.findDepartmentById(departmentId);
		if (finddepartmentbyid == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			this.departmentservice.deleteDepartment(departmentId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
