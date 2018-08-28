package com.revature.bank.dao;

import java.sql.Connection;
import java.util.List;

import com.revature.bank.account.Account;


public interface AccountDAO {

	public List<Account> getAccounts();
	public Account getAccountByUser(String name);
	public Account getAccountByUser(String name, Connection con);
	public int createAccount(Account account);
	public int updateAccount(Account account);
	public int deleteAccountByUser(String name);	
}