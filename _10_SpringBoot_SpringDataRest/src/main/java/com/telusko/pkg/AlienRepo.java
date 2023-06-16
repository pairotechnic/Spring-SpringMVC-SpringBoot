package com.telusko.pkg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.telusko.pkg.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
//	When you run the project on localhost:8080, the url is what is mentioned in collectionResourceRel, i.e., localhost:8080/aliens
//	All the methods are prebuilt in JpaRepository, that's the power of Spring Data
//	And REST says. "I will map it with the help of this "aliens" url, i.e., collectionResourceRel
//	REST provides all the linking features

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
