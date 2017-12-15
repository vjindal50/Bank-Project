package com.dao;

import java.util.List;

import com.bean.AccountLog;

public interface AccountLogDAO {
	
	public List<AccountLog> fingByAccNumber(int Anum);
	public void saveAccount(AccountLog accountlog);
	public List<AccountLog> getAllAccountLogs();

}
