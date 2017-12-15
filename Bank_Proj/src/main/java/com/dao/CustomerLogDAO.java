package com.dao;

import java.util.List;

import com.bean.CustomerLog;

public interface CustomerLogDAO {
	
	public List<CustomerLog> getAllCustLog();
	public int insertIntoCustLog(CustomerLog custLog);
	public List<CustomerLog> findById(int id);

}
