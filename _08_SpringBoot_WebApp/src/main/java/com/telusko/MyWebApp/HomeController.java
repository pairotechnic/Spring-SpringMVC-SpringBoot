package com.telusko.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
	// In Spring, we only create HttpServletRequest object, or HttpServletResponse
	// object or both if we need to

//		HttpSession session = req.getSession();

//		String name = req.getParameter("name");
//			name parameter comes from client by typing ?name=rohit after localhost:8080/home
//		System.out.println("hi " + name);
//		session.setAttribute("name", name);
//			Here, "name" becomes the key, and whatever is stored in String name ( from getParameter("name") ) becomes value in this key value pair
//			These get stored in the session object

//		return "home.jsp";
//		return "home";
//			By default, Spring Boot searches inside src/main/webapp for the jsp pages due to default autoconfiguration
//			If we return "home.jsp" Spring Boot prints the string "home.jsp" on the screen instead of displaying the contents of the page home.jsp
//			We need tomcat jasper dependency to know how to convert jsp into servlet, thus displaying page instead of page name as string

//	}

//	@RequestMapping("home")
//	public String home(@RequestParam("name") String myName, HttpSession session) {
////		We get object of HttpSession because of dependency injection
////		What is written inside @RequestParam parentheses must match the attribute name passed by client in url bar
////		@RequestParam("name") value is assigned to String myName
//
//		System.out.println("hi " + myName);
//		session.setAttribute("fullname", myName);
////			The key of this session, i.e., "fullname" must match the EL variable used in home.jsp
//
//		return "home";
//	}

//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
////		Here ModelAndView has replaced Request, Response, as well as Session objects
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("fullname", myName);
////			We can add as many attributes as we want, by calling the mv.addObject() method multiple times
////			The code is cleaner and easier to debug
//		mv.setViewName("home");
//
//		return mv;
//	}

	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
//		We pass an object alien of Alien class to the fuction
//		This alien object will store all the parameters passed by client, as they are properties of Alien class

		ModelAndView mv = new ModelAndView();
//			We create an object mv of ModelAndView class
		mv.addObject("obj", alien);
//			We add an object alien as an attribute to the model
//			We give the attribute a name "obj"

		mv.setViewName("home");

		return mv;
	}

}
