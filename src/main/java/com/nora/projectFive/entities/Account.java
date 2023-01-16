package com.nora.projectFive.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long account_no;
	private float balance;
	private long civil_id;
	private String first_name;
	private String last_name;
	private String password;
	

	public Account() {

	}
	public Account(long account_no) {
		super();
		this.account_no = account_no;
	}
	public Account(long account_no, float balance, String first_name, String last_name, long civil_id,
			String password) {
		this.account_no = account_no;
		this.balance = balance;
		this.civil_id=civil_id;
		this.first_name = first_name;
		this.last_name = last_name;

		this.password = password;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getCivil_id() {
		return civil_id;
	}
	public void setCivil_id(long civil_id) {
		this.civil_id = civil_id;
	}

	
	

	
}
