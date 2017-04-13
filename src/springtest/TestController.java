package springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/login")
	public ModelAndView login(){
		System.out.println("TestController.login() coming herere");
		return  new ModelAndView("welcomePage", "welcomeMessage", "Welcomeeeeeeeee");
		
	}// Model and View Closed..
	

}
