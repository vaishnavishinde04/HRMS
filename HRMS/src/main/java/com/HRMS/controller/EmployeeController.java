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

import com.HRMS.model.EmployeeMaster;
import com.HRMS.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("employee")
	public ResponseEntity<List<EmployeeMaster>> getallemployee()
	{
		List<EmployeeMaster> getallemp = this.empservice.getallemp();
		
		if(getallemp.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(getallemp);
	}
	
	@GetMapping("employee/{empid}")
	public ResponseEntity<EmployeeMaster> findbyid(@PathVariable("empid") int empid)
	{
		EmployeeMaster findempbyid = this.empservice.findempbyid(empid);
		if(findempbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(findempbyid);
	}
	
	@PostMapping("employee")
	public ResponseEntity<EmployeeMaster> addemp(@RequestBody EmployeeMaster empmaster)
	{
		EmployeeMaster addemp = this.empservice.addemp(empmaster);
		if(addemp!=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(addemp);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	@PutMapping("employee/{empid}")
	public ResponseEntity<EmployeeMaster> updateemp(@RequestBody EmployeeMaster empmaster, @PathVariable("empid") int empid)
	{
		EmployeeMaster findempbyid = this.empservice.findempbyid(empid);
		if(findempbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		EmployeeMaster updateemp = this.empservice.updateemp(empmaster,empid);
		if(updateemp!=null)
		{
			return ResponseEntity.status(HttpStatus.OK).body(updateemp);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	
	@DeleteMapping("employee/{empid}")
	public ResponseEntity<String> deleteemp(@PathVariable("empid") int empid)
	{
		EmployeeMaster findempbyid = this.empservice.findempbyid(empid);
		if(findempbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		String deleteemp = this.empservice.deleteemp(empid);
		if(deleteemp.equals("Deleted"))
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(deleteemp);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}

}
