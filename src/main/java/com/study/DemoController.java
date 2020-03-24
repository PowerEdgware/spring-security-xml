package com.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Lock
//LinkedBlockingQueue
//ArrayBlockingQueue
@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;

	@GetMapping({ "/", "/index" })
	public String index(HttpServletRequest request) {
		demoService.printPropertyService();
		return request.toString() + "\tOK";
	}
	
//	@Secured(value = {"ROLE_USER"})
	@PreAuthorize("hasRole('USER')")
	@GetMapping({ "/root" })
	public String root(HttpServletRequest request) {
		return request.toString() + "\troot";
	}
	
	
}
