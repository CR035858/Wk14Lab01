package zglcathymemvc1.gl.thyme.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/greet")
public class HomeController {

	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		String greetings = "Wish You a Good Day";
		model.addAttribute("greeting", greetings);
		return "welcome";
		
	}
	@GetMapping("/register")
	public String showRegnForm(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		List <String> cities = new ArrayList<String>();
		cities.add("Bangalore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Coimbatore");
		cities.add("New Delhi");
		model.addAttribute("cities", cities);
		return "regnform";
	}
	@PostMapping("/register")
	public String confirmRegister(@ModelAttribute("user") User user)
	{
		return "confirmregn";
	}
}
