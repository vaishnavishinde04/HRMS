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

import com.HRMS.model.DemandMaster;
import com.HRMS.services.DemandService;

@RestController
public class DemandController {
	@Autowired DemandService demandService;
	
	@GetMapping("/demands")
	public ResponseEntity<List<DemandMaster>> getAllDemands() {
       List<DemandMaster> allDemands = demandService.getAllDemands();
       
       if (allDemands.isEmpty()) {
    	   return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	    } 
       return ResponseEntity.of(Optional.of(allDemands));

	}
		
	@GetMapping("/Demand/{id}")
	public ResponseEntity<DemandMaster> getDemandById(@PathVariable("id")int id){
		DemandMaster deamandById= demandService.getDemandById(id);
		
		if(deamandById == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(deamandById);
	}
	
	@PostMapping("/demand")
	public ResponseEntity<DemandMaster> addDemand(@RequestBody DemandMaster demand){
		try {
			DemandMaster addedDemand = demandService.addDemand(demand);
			return ResponseEntity.ok().body(addedDemand);
		}catch(Exception e){
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}
	
	@PutMapping("demand")
	public ResponseEntity<DemandMaster> updateProject(@RequestBody DemandMaster demand){
		int id = demand.getDemand_id();
		DemandMaster demandById = demandService.getDemandById(id);
		if(demandById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try {
			DemandMaster updatedDemand=demandService.updateDemand(demand);
			return ResponseEntity.ok().body(updatedDemand);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("/demand/{id}")
	public ResponseEntity<Void> deleteDemand(@PathVariable("id") int id) {
		
		DemandMaster demandById = demandService.getDemandById(id);
		if (demandById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			this.demandService.deleteDemand(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
