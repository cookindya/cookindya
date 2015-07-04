package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiWallet  
 */
@Entity
@Table(name = "CI_WALLET", catalog = "CI_DB")
public class Wallet implements java.io.Serializable {

	private int walletId;
	private Integer userId;
	private Integer balance;

	public Wallet() {
	}

	public Wallet(int walletId) {
		this.walletId = walletId;
	}

	public Wallet(int walletId, Integer userId, Integer balance) {
		this.walletId = walletId;
		this.userId = userId;
		this.balance = balance;
	}

	@Id
	@Column(name = "WALLET_ID", unique = true, nullable = false)
	public int getWalletId() {
		return this.walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	@Column(name = "USER_ID")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "BALANCE")
	public Integer getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}
