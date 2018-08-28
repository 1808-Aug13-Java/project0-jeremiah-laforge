package com.revature.bank.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.bank.account.Account;
import com.revature.bank.user.User;
import com.revature.bank.util.ConnectionUtil;

public class UserDaoImp implements UserDAO{

	private static Logger log = Logger.getRootLogger();
	private static final String SQLIOERR = "Connection failed, or SQL error.";
	private static final String USERNAME = "USER_NAME";
	private static final String FNAME = "FNAME";
	private static final String LNAME = "LNAME";
	private static final String PSWD = "PSWD";
	
	@Override
	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();

		String sql = "SELECT * FROM BANK_USER";

		try (Connection con = ConnectionUtil.getConnection();
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql)) {

			while (rs.next()) {
				User user = new User();

				user.setUserName(rs.getString(USERNAME));
				user.setfName(rs.getString(FNAME));
				user.setlName(rs.getString(LNAME));
				user.setPsWord(PSWD);

				userList.add(user);
			}

		} catch (IOException | SQLException e) {
			log.error(SQLIOERR, e);
		}

		return userList;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAccount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletUserByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
