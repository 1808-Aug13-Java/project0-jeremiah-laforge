package com.revature.bank.dao;

import java.sql.Connection;
import java.util.List;

import com.revature.bank.user.User;


public interface UserDAO {

	public List<User> getUsers();
	public User getUserByName(String name);
	public User getUserByName(String name, Connection con);
	public int createUser(User user);
	public int updateAccount(User user);
	public int deletUserByName(String name);	
	
}
