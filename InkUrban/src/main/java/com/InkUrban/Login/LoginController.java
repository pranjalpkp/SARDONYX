package com.InkUrban.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	  @GetMapping("/loginDashboard")
	    public String loginPage() {
	        return "login"; 
	        }

}
