package com.dao;

import java.util.List;

import com.bean.AccountLog;

public interface AccountLogDAO {
	
	public List<AccountLog> fingAccLogByAccNumber(int Anum);
	public void saveAccountLog(AccountLog accountlog);
	public List<AccountLog> getAllAccountLogs();

}
