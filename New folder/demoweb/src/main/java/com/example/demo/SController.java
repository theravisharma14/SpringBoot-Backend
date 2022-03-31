package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SController {
	//@RequestMapping("/")
//	public String home(@RequestParam("name") String myName,HttpSession session)
//	{	
//		session.setAttribute("name", myName);
//		return "home";
//		
	//}
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam("name") String myName)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}

}