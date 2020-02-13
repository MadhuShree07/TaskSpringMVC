package xworkz.spring.mvc.component;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class FirstController {

	public FirstController() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/first.do")
	public String onFirst(HttpServletRequest req) {
		System.out.println("invoked onFirst");

		String message = req.getParameter("message");
		System.out.println("Message:" + message);

		String email = req.getParameter("email");
		System.out.println("Email:" + email);

		String file = req.getParameter("file");
		System.out.println("File Details:" + file);

		return "/Index.jsp";
	}
}