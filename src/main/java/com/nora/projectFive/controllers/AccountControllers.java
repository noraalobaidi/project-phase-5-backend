package com.nora.projectFive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.nora.projectFive.entities.Account;
import com.nora.projectFive.services.AccountServices;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AccountControllers {

	@Autowired
	AccountServices service;
	
//	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/accounts")
	public Iterable<Account> getAllAccounts() {
		return service.getAllAccounts();
	}
	
//	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/accounts")
	Account createNewAccount( @RequestBody Account account)
	{
		return service.createNewAccount(account);
	}
//	@CrossOrigin(origins="http://localhost:4200")
	@PutMapping("/accounts")
	String updateAccount(@RequestBody Account account) {
		service.updateAccount(account);
		return "product updated successfully";
	}

}
