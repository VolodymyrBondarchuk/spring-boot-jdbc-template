package com.app.moviereviews_jdbc.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyErrorController implements ErrorController  {
 
    @RequestMapping("/error")
    public ModelAndView handleError() {
    	
    	ModelAndView errorPage = new ModelAndView("error.html");
    	
        return errorPage;
    }
 
    @Override
    public String getErrorPath() {
        return "/error";
    }
}