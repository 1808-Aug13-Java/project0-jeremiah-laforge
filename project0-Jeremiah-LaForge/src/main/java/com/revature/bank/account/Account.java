package com.revature.bank.account;

/*
 * 
 */
public class Account {
	
	private String userName;
	private long ballance;

	public Account() {
		super();
		ballance = 0L;
		userName = null;
	}

	public Account(String userName, long ballance) {
		super();
		this.userName = userName;
		this.ballance = ballance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUser(String userName) {
		this.userName = userName;
	}

	public long getBallance() {
		return ballance;
	}

	public void setBallance(long ballance) {
		this.ballance = ballance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ballance ^ (ballance >>> 32));
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (ballance != other.ballance)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName)) {
			return false;}
		return true;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", ballance=" + ballance + "]";
	}

	
	
}
