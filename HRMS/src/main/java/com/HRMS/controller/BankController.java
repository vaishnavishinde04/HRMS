package com.HRMS.controller;

import java.util.List;

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

import com.HRMS.model.BankMaster;
import com.HRMS.services.BankService;

@RestController
@CrossOrigin(origins = "*")
public class BankController {

	@Autowired
	private BankService bankservice;

	@GetMapping("/bank")
	public ResponseEntity<List<BankMaster>> getbanks() {
		List<BankMaster> getbanks = this.bankservice.getAllBanks();
		if (getbanks.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getbanks);
	}

	@GetMapping("/bank/{bankId}")
	public ResponseEntity<BankMaster> getBankById(@PathVariable("bankId") int bankId) {
		BankMaster getbanks = this.bankservice.getBankById(bankId);

		if (getbanks == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.ok().body(getbanks);

	}

	@PostMapping("/bank")
	public ResponseEntity<BankMaster> addbank(@RequestBody BankMaster bank) {

		try {
			BankMaster addbank = this.bankservice.addBank(bank);
			return ResponseEntity.ok().body(addbank);

		} catch (Exception e) {

			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/bank/{bankId}")
	public ResponseEntity<Void> deletebank(@PathVariable("bankId") int bankId) {
		
		
		BankMaster getbanks = this.bankservice.getBankById(bankId);
		if (getbanks == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		try {
			bankservice.deleteBank(bankId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/bank")
	public ResponseEntity<BankMaster> updatebank(@RequestBody BankMaster bank) {

		int bankId = bank.getBankId();
		BankMaster getbanks = this.bankservice.getBankById(bankId);
		if (getbanks == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		try {
			BankMaster updatebank = this.bankservice.updateBank(bank);
			return ResponseEntity.ok().body(updatebank);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
