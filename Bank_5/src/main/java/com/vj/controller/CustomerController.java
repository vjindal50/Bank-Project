package com.vj.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vj.model.Customer;
import com.vj.service.CustomerService;
 
@Controller
public class CustomerController {
 
//    private static final Logger logger = Logger
//            .getLogger(CustomerController.class);
 
    public CustomerController() {
        System.out.println("CustomerController()");
    }
 
    @Autowired
    private CustomerService customerService;
 
    @RequestMapping(value = "/")
    public ModelAndView listCustomer(ModelAndView model) throws IOException {
        
//        Customer customer = new Customer();
//        customer.setAddress("perry");
//        customer.setAlternatePhone("0000000");
//        customer.setDOB(new Date());
//        customer.setEmail("v@v.v");
//        customer.setFirstName("vj");
//        customer.setJoinDate(new Date());
//        customer.setLastName("vj");
//        customer.setMiddleName("vj");
//        customer.setPassword("vj");
//        customer.setPhone("00000");
//        customer.setStatus("active");
//        customer.setUserName("vj");
//        customerService.addCustomer(customer);
//        System.out.println(customer);
//    	  List<Customer> listCustomer = customerService.getAllCustomer();
//        System.out.println(listCustomer);
//        model.addObject("model", "Customer");
        model.setViewName("welcomPage");
        return model;
    }
 
//    @RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
//    public ModelAndView newContact(ModelAndView model) {
//        Customer Customer = new Customer();
//        model.addObject("Customer", Customer);
//        model.setViewName("CustomerForm");
//        return model;
//    }
// 
//    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
//    public ModelAndView saveCustomer(@ModelAttribute Customer Customer) {
//        if (Customer.getCustID() == 0) { // if Customer id is 0 then creating the
//            // Customer other updating the Customer
//            customerService.addCustomer(Customer);
//        } else {
//            customerService.updateCustomer(Customer);
//        }
//        return new ModelAndView("redirect:/");
//    }
// 
//    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
//    public ModelAndView deleteCustomer(HttpServletRequest request) {
//        int CustomerId = Integer.parseInt(request.getParameter("id"));
//        customerService.deleteCustomer(CustomerId);
//        return new ModelAndView("redirect:/");
//    }
// 
//    @RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
//    public ModelAndView editContact(HttpServletRequest request) {
//        int CustomerId = Integer.parseInt(request.getParameter("id"));
//        Customer Customer = customerService.getCustomer(CustomerId);
//        ModelAndView model = new ModelAndView("CustomerForm");
//        model.addObject("Customer", Customer);
// 
//        return model;
//    }
 
}
