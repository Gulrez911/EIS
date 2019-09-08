package com.gul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gul.entity.Employee;
import com.gul.repo.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;

	@GetMapping("/")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView("index");
		Employee employee = new Employee();
		mav.addObject("employee", employee);
		return mav;
	}

	@PostMapping("save")
	public ModelAndView save(@ModelAttribute("employee") Employee employee) {
		ModelAndView mav = new ModelAndView("index");
		repo.save(employee);
		mav.addObject("employee", new Employee());
		return mav;
	}
}
