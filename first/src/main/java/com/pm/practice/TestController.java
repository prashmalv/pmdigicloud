package com.pm.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/pm/test")
	@ResponseBody
	public String handleRests() {
		
		return "STS working...";
	}
	
	@RequestMapping("/pm/testweb")
	public String handleWeb() {
		
		return "webview";
	}
	
	@GetMapping("/pm/launchurl")
	public String handlelaunchUrl() {
		
		return "webview";
	}

}
