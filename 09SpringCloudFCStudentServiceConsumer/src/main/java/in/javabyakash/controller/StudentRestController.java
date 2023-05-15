package in.javabyakash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.ICourseRestConsumer;
import in.javabyakash.model.Course;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private ICourseRestConsumer consumer;
		
	@GetMapping("/info")
	public ResponseEntity<String> getCourseInfo(){
		ResponseEntity<String> info = consumer.getCourseInfo();
		return ResponseEntity.ok(info.getBody());
	}
	
	@GetMapping("/course")
	public ResponseEntity<Course> getCourse(){
		ResponseEntity<Course> course = consumer.getCourse();
		return ResponseEntity.ok(course.getBody());
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<String> getCourseById(@PathVariable("id") Integer id){
		ResponseEntity<String> courseById = consumer.getCourseById(id);
		return ResponseEntity.ok(courseById.getBody());
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Course>> getAllCourse(){
		ResponseEntity<List<Course>> allCourse = consumer.getAllCourse();
		return ResponseEntity.ok(allCourse.getBody());
	}
}
