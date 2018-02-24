package com.liucl.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liucl.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/112")
	@ResponseBody
	public String test(){
		testService.doSomething();
		System.out.println("test reload");
		return "finish call service";
	}
	
}
