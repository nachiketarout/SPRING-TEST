package springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/login")
	public ModelAndView login(){
		System.out.println("TestController.login() coming herere");
		System.out.println("TestController.login() another systra commentssss");
		return  new ModelAndView("welcomePage", "welcomeMessage", "Welcomeeeeeeeee");
		
	}// Model and View Closed..
	

}
