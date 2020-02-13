package xworkz.spring.mvc.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class FirstController2 {

	public FirstController2() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/first.do")
	public String onFirst(HttpServletRequest req) {
		System.out.println("invoked onFirst");
		System.out.println("invoked onFirst");
		String message = req.getParameter("message");
		System.out.println("Message:" + message);

		String email = req.getParameter("email");
		System.out.println("Email:" + email);

		return "/index.jsp";
	}
}
