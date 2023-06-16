package com.telusko.pkg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.telusko.pkg.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}

//public interface AlienRepo extends CrudRepository<Alien, Integer> {

//	Here we are creating an interface AlienRepo that extends CrudRepository
//	When we say CrudRepository<Alien,Integer>,
//		Alien is the Table name aka Class name with @Entity annotation , and 
//		Integer is the datatype of Primary key, i.e, the property of Alien with @Id annotation 

//	We are not implementing this interface anywhere. 
//	Spring Data REST does it for you. 
//	It creates some class that implements the AlienRepo interface so that you can use its methods

//	Because of Spring Data JPA, we just have to extend CrudRepository to be able to perform all the methods

//	List<Alien> findByTech(String tech);
//		findByTech isn't a method of CrudRepository interface, it is a Derived Query method
//		Derived method names have two main parts separated by the first By keyword:
//		eg)	List<Alien> findByTech(String tech)
//		The first part — such as find — is the introducer, and the rest — such as ByTech — is the criteria, i.e., By followed by a property name of Alien class
//		Spring Data JPA supports find, read, query, count and get. So, we could have done queryByName, and Spring Data would behave the same.
//		Refer to the link for more info
//			https://www.baeldung.com/spring-data-derived-queries

//	List<Alien> findByAidGreaterThan(int aid);
//		Derived Query Method using comparison condition keywords

//	@Query("from Alien where tech =?1 order by aname")
//		This is a JPQL query. It executes when the custom method name is called
//		Alien is the table name, tech is the column/field name
//		Since the value comes from user, we write ?, and in JPQL we write question mark numbers because we might have multiple question marks in a query

//		So, this query selects all the rows where tech = (String tech)
//		Then it arranges them in ascending order by their aname, and returns the rows

//	List<Alien> findByTechSorted(String tech);
//}
