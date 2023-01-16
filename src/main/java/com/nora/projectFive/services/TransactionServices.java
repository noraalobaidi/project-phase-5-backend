package com.nora.projectFive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.projectFive.dao.TransactionRepo;
import com.nora.projectFive.entities.Transaction;

@Service
public class TransactionServices {
	
	@Autowired
	TransactionRepo repo;
	
	public Iterable<Transaction> getAllTransactions() {
		return repo.findAll();
	}
	
	public Transaction addTransaction(Transaction transaction) {
		return repo.save(transaction);
	}

}
