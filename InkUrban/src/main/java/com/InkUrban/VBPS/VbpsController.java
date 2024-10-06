package com.InkUrban.VBPS;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VbpsController {
	@GetMapping("/vbps_dashboardUrl")
	public String super_admin_dashboard(Principal p, Model m) {
		String name = p.getName();
		System.out.println("Are U There!"+name);
		m.addAttribute("name", name);
		return "vbps/vbpsDashboard";
	}

}
