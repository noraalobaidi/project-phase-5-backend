package com.nora.projectFive.entities;

//import com.nora.projectFive.entities.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transaction_id;
	private float amount;
	private float pre_balance;
	private float new_balance;
	private String date;
	private String type;
	
	@ManyToOne
	private Account account_no;
	@OneToOne
	private Account transfer_acc_no;
	
	public Transaction() {

	}  
	
	public Transaction(int transaction_id, float amount, float pre_balance, float new_balance, String date, String type,
			long accountnumber, long transfertoaccount) {
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.pre_balance = pre_balance;
		this.new_balance = new_balance;
		this.date = date;
		this.type = type;
		this.account_no = new Account(accountnumber);
		this.transfer_acc_no = new Account(transfertoaccount);
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getPre_balance() {
		return pre_balance;
	}

	public void setPre_balance(float pre_balance) {
		this.pre_balance = pre_balance;
	}

	public float getNew_balance() {
		return new_balance;
	}

	public void setNew_balance(float new_balance) {
		this.new_balance = new_balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAccount_no() {
		return account_no;
	}

	public void setAccount_no(Account account_no) {
		this.account_no = account_no;
	}

	public Account getTransfer_acc_no() {
		return transfer_acc_no;
	}

	public void setTransfer_acc_no(Account transfer_acc_no) {
		this.transfer_acc_no = transfer_acc_no;
	} 
	
	
}
