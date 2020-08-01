package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
//	
//	public String course(HttpServletRequest req)
//	{
//		/*
//		 * HttpSession: Provides a way to identify a user across more than one page request or visit to a Web site 
//		 * 				and to store information about that user. 
//		 * 
//		 * HttpServletRequest: Returns the current session associated with this request, or if the request does not have a session, creates one.
//		 *
//		 * 
//		 * getSession: Returns the current session associated with this request,
//		 * 			   or if the request does not have a session, creates one.
//		 * 
//		 * 
//		 */
//		HttpSession session = req.getSession();	
//		String cname = req.getParameter("cname");
//		session.setAttribute("cname", cname);
//		System.out.println(cname);
//		
//		return "course.jsp";
//	}
//******************************************************************************************************************	
	
	/*
	 * 												DEMO ON MVC
	 */
	
//*******************************************************************************************************************	
	
	@RequestMapping("/courses")
	public ModelAndView course( @RequestParam("cname") String courename)
	{
//		session.setAttribute("cname", courename);
	
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", courename);
		mv.setViewName("course.jsp");
		return mv;
	}
}
