package com.hwh.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/index")
	public String index(){
		return "Hello World";
	}
	
	@RequestMapping("/hello")
	public String hello() throws Exception {
	    throw new Exception();
	}
}
