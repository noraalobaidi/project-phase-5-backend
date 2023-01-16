package com.nora.projectFive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.projectFive.entities.Account;
import com.nora.projectFive.entities.Transaction;
import com.nora.projectFive.services.TransactionServices;

@RestController
public class TransactionControllers {
	
	@Autowired
	TransactionServices service;
	
	@GetMapping("/transactions")
	public Iterable<Transaction> getAllTransactions() {
		return service.getAllTransactions();
	}
	
	@PostMapping("/transactions/{accountNo}/{transferAccNo}")
	Transaction addTransferTransaction(@RequestBody Transaction transaction,@PathVariable long accountNo,@PathVariable long transferAccNo)
	{
		transaction.setAccount_no(new Account(accountNo));
		transaction.setTransfer_acc_no(new Account(transferAccNo));
		return service.addTransaction(transaction);
	}
	
	@PostMapping("/transactions/{accountNo}")
	Transaction addTransaction(@RequestBody Transaction transaction,@PathVariable long accountNo)
	{
		transaction.setAccount_no(new Account(accountNo));
		transaction.setTransfer_acc_no(null);
		return service.addTransaction(transaction);
	}

}
