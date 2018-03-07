package com.fengxin58.wechat.oauth2.action;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/say")
	public String oauth(@RequestParam(defaultValue = "hello world") String what) {
		return what;
	}
	
	@RequestMapping(value = "/principal")
	public Principal principal(Principal principal) {
		return principal;
	}
}
