package com.springmvc.homecontroller;

import org.apache.catalina.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages = {"com.springmvc.model"})

public class HomeController {
	/*6.  Inside “HomeController” create a method “displayHomePage()” with data type ModelAndView.
	 *  Map it with necessary annotation to the home path “/” and return the ModelAndView variable with jsp page name “home”.*/
	
	@RequestMapping("/")
	public ModelAndView displayHomePage() {
		ModelAndView hm = new ModelAndView("home");
		return hm;
	}

	/*8. Inside HomeController, create a method “displayForm()” with method “get” and map it to the url path “/form”.
	 *  The method should return a new ModelAndView variable with the JSP page name “form”.*/

		@RequestMapping("/form")
		public ModelAndView displayForm(@ModelAttribute("user")User user) {

			ModelAndView fm = new ModelAndView("form");
			return fm;
		
			
		}
		/*9. Inside HomeController create a method “processForm()” with method “post” and url path “/process-form”.
		 *  It should return new ModelAndView with jsp page name “submission-details”.*/
		
		@RequestMapping(value="/process-form", method = RequestMethod.POST)
		
		public ModelAndView processForm(@ModelAttribute("user")User user) {
			ModelAndView pf = new ModelAndView("submission-details");
			return pf;
		}
		
}
