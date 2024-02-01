package com.example.springboot.learnepringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
	
	@CrossOrigin("/**")
	@RequestMapping("/courses")
	public List<Course>RetrieveAllCourses(){
		return Arrays.asList(
		new Course(1,"lraen AWS","in 25 minute"),		
		new Course(2,"lraen AWS","in 25 minute"),		
		new Course(3,"lraen AWS","in 25 minute")

		
		);
	}
	
	@RequestMapping("/home")
	public String index() {
	    return "home"; // Remove "WEB-INF/" from the view name
	}

}
