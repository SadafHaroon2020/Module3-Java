package com.springmvc.SpringMVCLab01.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.SpringMVCLab01.model.User;

@Controller

public class HomeController {
	/*
	 * 6. Inside â€œHomeControllerâ€ create a method â€œdisplayHomePage()â€ with
	 * data type ModelAndView. Map it with necessary annotation to the home path
	 * â€œ/â€ and return the ModelAndView variable with jsp page name â€œhomeâ€.
	 */

	@RequestMapping("/")
	public ModelAndView displayHomePage() {
		System.out.println("*****Logging-DEFAULT****");
		ModelAndView hm = new ModelAndView("home");
		return hm;
	}

	/*
	 * 8. Inside HomeController, create a method displayForm() with method
	 * â€œgetâ€ and map it to the url path /form. The method should return a new
	 * ModelAndView variable with the JSP page name â€œformâ€.
	 */

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView displayForm() {
		System.out.println("*****Logging-FORM****");
		ModelAndView fm = new ModelAndView("form");
		return fm;

	}
	/*
	 * 9. Inside HomeController create a method â€œprocessForm()â€ with method
	 * â€œpostâ€ and url path â€œ/process-formâ€. It should return new
	 * ModelAndView with jsp page name â€œsubmission-detailsâ€.
	 */

	@RequestMapping(value = "/process-form", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("user") User user) {
		System.out.println("*****Logging-SUBMISSION***");
		ModelAndView pf = new ModelAndView("submission-details");
		return pf;
	}

}
