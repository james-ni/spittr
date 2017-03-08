package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/login", method=POST)
	public String login(){
		return "redirect:/spittles";
	}
}
