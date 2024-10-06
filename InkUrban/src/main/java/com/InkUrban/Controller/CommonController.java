package com.InkUrban.Controller;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.InkUrban.Models.Contact_meeting;
import com.InkUrban.Validation.ValidationController;
import com.InkUrban.dao.ContactFormRepository;

@Controller
public class CommonController {
	@Autowired
	ContactFormRepository CFormRepo;
	
	@Autowired
	ValidationController validation;
	
	
	@GetMapping("/admin_dashboardUrl")
	public String super_admin_dashboard(Principal p, Model m) {
		//System.out.println("Are U There!");
		String name = p.getName();
		m.addAttribute("name", name);
		List<Contact_meeting> dataList = CFormRepo.findAll(); // Example: Fetch data from the repository
        m.addAttribute("dataList", dataList);
		return "super/adminDashboardUrl";

	}
	@RequestMapping("/contactForm")
	public String ContactForm(Contact_meeting contactfm,BindingResult result,Errors errors,RedirectAttributes ra,Model model) {
		LocalDate currentDate = LocalDate.now();
		String message = contactfm.getMessage();
		 if (errors.hasErrors()) {
	            
			 return "redirect:/";
	        }
		 
		contactfm.setCreated_date(currentDate.toString());
		contactfm.setStatus("Active");
		CFormRepo.save(contactfm);
		return "redirect:/";
	}

	@GetMapping("/view/{id}")
    public String viewDetails(@PathVariable("id") Integer id, Model model) {
		Contact_meeting contact = CFormRepo.findById(id).orElse(null);
			model.addAttribute("contact", contact);
        return "super/viewDetails"; 
    }
	
}
