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

	@GetMapping("add")
	public String demo1(@RequestParam("p") int x, @RequestParam("q") int y) {
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

	@GetMapping("displayname/{num1}/{lname}")
	@ResponseBody
	public String displayname(@PathVariable("num1") int a, @PathVariable("lname") String b) {
		String c = a + " " + b;
		return (c);
	}

	@GetMapping("mul")
	public String demo6(@RequestParam("p") int x, @RequestParam("q") int y) {
		int r = x * y;
		return Integer.toString(r);
	}

	@GetMapping("multonew")
	
	public ModelAndView multonew(@RequestParam("x") int a, @RequestParam("y") int b) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("output");	
		mv.addObject("result", a * b);
		return mv;
	}
	
	@GetMapping("name/{num1}/{lname}")
	@ResponseBody
	public ModelAndView name(@PathVariable("num1") String a, @PathVariable("lname") String b) {
		ModelAndView mv = new ModelAndView();
		String c = a + " " + b;
		mv.setViewName("nameoutput");	
		mv.addObject("name", c);
		return mv;
	}
}
