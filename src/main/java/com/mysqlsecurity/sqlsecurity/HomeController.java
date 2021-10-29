package com.mysqlsecurity.sqlsecurity;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/login")
	public String Home()
	{
		return "login";
	}
	/*
	@GetMapping("/login")
    public String login(Principal principal) {
        if (principal != null) {
            return "redirect:/index";
        }
        return "/login";
    }*/

}
