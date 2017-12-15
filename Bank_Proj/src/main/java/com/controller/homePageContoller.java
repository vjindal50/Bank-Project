package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;


@Controller
@RequestMapping("/")
public class homePageContoller {
	
//	@Autowired
//	StudentDAOImpl studentDAOImpl;
	
//	@RequestMapping(value = "/logmein.html", method = RequestMethod.POST)
//	public void transfer(HttpServletRequest request, HttpServletResponse response) {
//		Login(request,response);
//	}
	
	@RequestMapping(value = {"/homeME"}, method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In home page controller");
		
		String submit = request.getParameter("submit");
		
		System.out.println(submit);
//		System.out.println(pass);
		
		WebApplicationContext context = RequestContextUtils.findWebApplicationContext(request);
//		StudentDAOImpl student = (StudentDAOImpl)context.getBean("studentDao");  	    
//	    
//		Student s = student.login(uname, pass);
//		System.out.println(s);
		
//	    if ( s != null) {
//	    		System.out.println("hrere");
//	    		Map<String, Object> map = new HashMap<String, Object>();
//	    		map.put("stud", s.getFullName());
//	    		map.put("info", s.toString());
//	    		
	    		return new ModelAndView("home", "model", submit);
//	    } else {
//	    		List<Student> s1 = student.allStudents();
//	    		System.out.println(s1.size());
//	    		return new ModelAndView("home", "model", "Failed");
//	    }
	    
		
		
	} 
}
