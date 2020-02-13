package xworkz.spring.mvc.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")

public class CountryController {

	public CountryController() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/country.do")
	public String onFirst(HttpServletRequest req) {
		System.out.println("invoked onFirst");
		String countryName = req.getParameter("countryName");
		System.out.println("countryName" + countryName);
		String population = req.getParameter("population");
		System.out.println("population" + population);
		String continent = req.getParameter("continent");
		System.out.println("continent" + continent);
		req.setAttribute("countryName", countryName);

		return "/end.jsp";
	}
}
