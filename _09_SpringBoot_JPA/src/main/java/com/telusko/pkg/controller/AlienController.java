package com.telusko.pkg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.pkg.dao.AlienRepo;
import com.telusko.pkg.model.Alien;

//@Controller
@RestController
//	By adding the @RestController to a controller class, we don't have to add @ResponseBody annotation to each of the request methods in it
//	It means that all methods will work with RESTful API, and will send xml or json data
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {

		return "home.jsp";
	}

//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid) {

//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//			instead of using setViewName method, we can pass view name here in constructor

//		Alien alien = repo.findById(aid).orElse(null);
//			findById returns an entity with the provided aid, but if such an entity is not found, it returns {@literal Optional#empty()}
//			alien is an Alien type object and can't store an Optional<Alien> type object
//			So we add orElse(null) to handle the cases where entity isn't found

//		Alien alien = repo.findById(aid).orElse(new Alien());
//			Here we add orElse(new Alien()) to handle the cases where entity isn't found

//		Optional<Alien> optionalAlien = repo.findById(aid);
//			Create an Optional<Alien> object to store findById output (which may or may not find an entity)
//		Alien alien = optionalAlien.get();
//			get() method returns value if present, otherwise throws

//		System.out.println(repo.findByTech("Python"));
//			Derived Query Method

//		System.out.println(repo.findByAidGreaterThan(102));
//			Derived Query Method with comparison condition

//		System.out.println(repo.findByTechSorted("Python"));
//			Custom Method with attatched @Query annotation

//			So, this query selects all the rows where tech = "Python"
//			Then it arranges them in ascending order by their aname, and returns the rows

//		mv.addObject(alien);

//		mv.setViewName("showAlien.jsp");

//		return mv;
//	}

//	@RequestMapping("/aliens")
//	@ResponseBody
////		In SpringMVC, when return type of method is String, it assumes view name is being returned
////		In this case, we are returning data, so we add the @ResponseBody annotation
//	public String getAliens() {
//
//		return repo.findAll().toString();
////			findAll returns all instances of Alien, as Iterable<Alien>, which we have to convert to String to match the method's return type
//	}

//	@RequestMapping("/alien/{alien_id}")
//	@ResponseBody
//	public String getAlien(@PathVariable("alien_id") int a_id) {
////		@PathVariable takes the value of alien_id from url, and assigns it to int aid
//
//		return repo.findById(a_id).toString();
////			findById returns a specific instance of Alien, as Optional<Alien>, which we have to convert to String to match the method's return type
////			findById takes the int aid parameter from getAlien method
//	}

//	NOW WE HAVE UPDATED THE AlienRepo TO EXTENDS JpaRepository INSTEAD OF CrudRepository

//	@RequestMapping(value = "/alien", method = RequestMethod.POST)
//		Here we specify Request type as Post
	@PostMapping(path = "/alien", produces = { "application/json" }, consumes = { "application/json" })
//		This is a shortcut annotation to specify request type as Post
//		When server provides data to client, (server to client) , server produces.
//		When server accepts data from client, (client to server) , server consumes.
//		You can restrict the formats of data that a server either produces or consumes in the @RequestMapping annotation 
	public Alien addAlien(@RequestBody Alien alien) {
//		The @RequestBody annotation is used when want to Post data in JSON format

		repo.save(alien);

		return alien;
	}

//	@RequestMapping("/aliens")
//		By default, if only "/aliens" is passed as parameter, it is attribute of path
//	@RequestMapping(path = "/aliens", produces = { "application/xml", "application/json" })
//		When we want to set output data format as well as mention path, we must explicitly assign "/aliens" to path
//		For this method, data format is restricted to only xml, and won't return anything if requested in postman in JSON
//	@RequestMapping(path = "/aliens", produces = { "application/xml", "application/json" })
//		Here ouput data is set to both xml and json
//	@ResponseBody
	@GetMapping("/aliens")
//		@RestController eliminated @ResponseBody, and @GetMapping replaced @RequestMapping
	public List<Alien> getAliens() {

		return repo.findAll();
//			In JpaRepository, findAll returns all instances of Alien, as List<Alien>, so we set return type to List<Alien>
//			The Java object List<Alien> is converted to JSON format by jackson-core jar flie in Spring Boot
//			This gives output in JSON format, which is useable by other web services
//			While submitting data from client to server, format is JSON
	}

	@RequestMapping("/alien/{alien_id}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("alien_id") int a_id) {

		return repo.findById(a_id);
//			findById returns a specific instance of Alien, as Optional<Alien>, so we set return type to Optional<Alien>
//			This gives output in JSON format, which is useable by other web services
	}

	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {

		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}

	@PutMapping(path = "/alien", consumes = { "application/json" })
//		@PutMapping updates the row if it exists and creates it if it doesn't exist
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);

		return alien;
	}

}
