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
	
    public CustomerController() {
        System.out.println("CustomerController()");
    }
 
    @RequestMapping(value = "/")
    public ModelAndView listCustomer(ModelAndView model) throws IOException {
        
        model.setViewName("welcomPage");
        return model;
    }
}
