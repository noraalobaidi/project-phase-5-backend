package com.nora.projectFive.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.projectFive.entities.Account;

@Repository
public interface AccountRepo extends CrudRepository<Account, Long>{

}
