package com.vj.dao;

import java.util.List;

import com.vj.model.AccountLog;
import com.vj.model.CustomerLog;

public interface AccountLogDAO {
	
	public void insertAccLog(AccountLog accountsLog);
	public List<AccountLog> getAllAcclog();
	public AccountLog getAccLog(int acclogId);

}
