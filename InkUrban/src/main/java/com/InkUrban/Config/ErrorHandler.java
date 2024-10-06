package com.InkUrban.Config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.RequestDispatcher;

@Controller
public interface ErrorHandler implements ErrorController{
	@RequestMapping("/error")
    public String handleError() {
        // Custom error handling logic
        return "error/400";
    }

    @RequestMapping("/error-404")
    public String handle404Error() {
        // Custom handling for 404 error
        return "error/404";
    }

    public String getErrorPath() {
        return "error/400";
    }
}
