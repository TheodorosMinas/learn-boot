package com.dodos.boot1.lear01bootaaa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroler {

	@Autowired
	private Course2 course2;
	
	@RequestMapping("zwonn")
	public List<Course> CourseControl() {
		return Arrays.asList(new Course(1,"dodos","stor"),new Course(2,"dodos2","stor2"),new Course(3,"dodos3","stor3"));
	}
	
	@RequestMapping("zwon2")
	public List<Course2> CourseControl2() {
		return Arrays.asList(course2);
	}
	
}
