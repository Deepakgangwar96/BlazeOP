package com.citi.deepak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

	@Autowired
	AlienDao repo;

	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("show")
	public ModelAndView show(Alien a)
	{
		repo.save(a);
		ModelAndView mv=new ModelAndView("show.jsp");
		mv.addObject("Obj",a);
		return mv;
	}
}
