package pl.skapustka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebHelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, To jest mój pierwszy napis ze Springa</h3>This message is coming from WebHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
