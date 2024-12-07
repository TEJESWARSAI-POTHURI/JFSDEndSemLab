package com.klef.jfsd.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class ClientController {

	@GetMapping("/")
	public String getMethodName() {
		return "Welcome to JFSD EndSemLab";
	}
	
	@GetMapping("demo5")
	public String demo5(@RequestParam("p") int x, @RequestParam("q") int y) {
		int r = x + y;
		return Integer.toString(r);
	}
	
	@GetMapping("display/{fname}/{lname}")
	@ResponseBody
	public String display(@PathVariable("fname") String a, @PathVariable("lname") String b) {
		String c = a + " " + b;
		return (c);
	}
	@GetMapping("employeehome")
    public ModelAndView employee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employee");
		return mv;
	}
	
	
}
