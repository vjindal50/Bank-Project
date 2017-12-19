package com.vj.dao;

import java.util.List;
import com.vj.model.CustomerLog;

public interface CustomerLogDAO {
	
	public void insertCustomerLog(CustomerLog customerlog);
	public List<CustomerLog> getAllCustomer();
	public CustomerLog getCustomerLog(int logId);

}
