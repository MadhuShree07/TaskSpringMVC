package xworkz.spring.mvc.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class Politics {
	public Politics() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/politics.do")
	public String onFirst(HttpServletRequest req) {
		System.out.println("invoked onFirst");
		String noOfCandidates = req.getParameter("noOfCandidates");
		System.out.println("noOfCandidates" + noOfCandidates);
		String date = req.getParameter("date");
		System.out.println("date" + date);
		String partyNames = req.getParameter("partyNames");
		System.out.println("partyNames" + partyNames);
		req.setAttribute("noOfCandidates", noOfCandidates);

		return "/end.jsp";
	}
}
