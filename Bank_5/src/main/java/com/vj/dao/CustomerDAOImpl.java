package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.vj.model.Customer;
 
@Repository
public class CustomerDAOImpl implements CustomerDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Customer> getAllCustomer() {
    		List<Customer> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.Customer").list();
    		System.out.println(list.size());
        return list;
    }
 
    public void deleteCustomer(int custId) {
    	Customer employee = (Customer) sessionFactory.getCurrentSession().load(
    			Customer.class, custId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
 
    }
 
    public Customer getCustomer(int empid) {
        return (Customer) sessionFactory.getCurrentSession().get(
        		Customer.class, empid);
    }
 
    public Customer updateCustomer(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
        return customer;
    }

	public Customer login(String uname, String pass) {
		List<Customer> list = getAllCustomer();
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).getUserName().equals(uname) && list.get(i).getPassword().equals(pass)) {
				return list.get(i);
			}
		}
		return null;
	}
 
}