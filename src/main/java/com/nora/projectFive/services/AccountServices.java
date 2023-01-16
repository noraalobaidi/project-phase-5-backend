package com.nora.projectFive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nora.projectFive.dao.AccountRepo;
import com.nora.projectFive.entities.Account;

@Service
public class AccountServices {

	@Autowired
	AccountRepo repo;
	
	public Iterable<Account> getAllAccounts() {
		return repo.findAll();
	}
	
	public Account createNewAccount(Account account) {
		return repo.save(account);
	}
	
	public Account updateAccount(Account account) {
		return repo.save(account);
	}
}


