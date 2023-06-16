package com.telusko;

// If "src/main/java" folder isn't already available, then create a folder called "java" inside "src/main" folder
// When creating the controller, make sure package is "com.telusko", and source folder is "src/main/java"

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
//	The @Controller annotation defines that the AddController class is a controller
public class AddController {

//	@RequestMapping("/add")
//		To specify for which request, we execute a method, we use @RequestMapping("/requestname")
//		In this case, the request name is add, so in the parentheses of @RequestMapping, we write "/add", and the method name is also add
//		Usually, we give the name of the method to the request that calls is, but this isn't necessary. 
//		We can give any unique name to the request that calls a method, as long as we use the same request name in our index.jsp
//	public String add() {
//		The return type of this method is String because we are returning the name of the view file as a String

//		return "display.jsp";
//			Here we return the relevant jsp page where we want to show output for this method
//			In this case, it is display.xml
//	}

//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//		Here we create request and response objects

//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
//			t1 and t2 are the names of <input> tags in index.jsp file
//		int k = i + j;
//			k is the generated data

//		AddService as = new AddService();
//			Here we create an object of service class
//		int k = as.add(i, j);
//			The actual process of addition shouldn't happen in the controller file. 
//			It should take place in service file, and result returned to controller file
//			Controller will then return the data to jsp file

//		ModelAndView mv = new ModelAndView();
//			Using ModelAndView object, mv, we can pass the generated data to view page
//		mv.setViewName("display.jsp");
//			display.jsp is the view that we want to call
//		mv.addObject("result", k);
//			k is the data we want to send to the page, and "result" is the label of that data used to refer to it in jsp page

//		return mv;
//	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
//		Here we pass 2 integer parameters
//		We use @RequestParam annotation with the names of <input> fields, "t1" and "t2", in parentheses, from index.jsp to initialize them
//		Thus we don't need to create request and response objects, and initialize int i and j inside the add function with getParameter method

		AddService as = new AddService();
		int k = as.add(i, j);

		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.jsp");

		mv.setViewName("display");
//			Ideally we should only mention the name of the page here, not the extension
//			The extension can be mentioned in configuration file
//			This is done so that we maintain the flexibility of changing view technology without having to touch code in the controllers
		mv.addObject("result", k);

		return mv;
	}

}
