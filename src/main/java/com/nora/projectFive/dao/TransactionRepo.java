package com.nora.projectFive.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.projectFive.entities.Transaction;

@Repository
public interface TransactionRepo extends CrudRepository<Transaction, Integer>{

}
