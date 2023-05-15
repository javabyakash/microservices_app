package in.javabyakash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.model.Course;

@RestController
public class CourseRestController {
	
	@Value("${server.port}")
	private Integer port;

	@GetMapping("/info")
	public ResponseEntity<String> getCourseInfo(){
		return ResponseEntity.ok("WELCOME TO COURSE INFO SERVICE RUNNING ON PORT : "+ port);
	}
	
	@GetMapping("/course")
	public ResponseEntity<Course> getCourse(){
		return ResponseEntity.ok(new Course(101, "SBMS", "RAGHU", 5000.0));
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<String> getCourseById(
				@PathVariable("id") Integer id
			)
	{
		return ResponseEntity.ok("COURSE INFO BASED ON GIVEN ID : "+id);
	}
	
	@GetMapping("/course/all")
	public ResponseEntity<List<Course>> getAllCourse(){
		return ResponseEntity.ok(
					List.of(
							new Course(101, "SBMS", "RAGHU", 5000.0),
							new Course(101, "SBMS", "NATARAZ", 5000.0),
							new Course(101, "CJ", "HK", 2500.0),
							new Course(101, "AWS", "ASHOK", 15000.0),
							new Course(101, "REACT", "SUDHAKAR", 7000.0)
							)
				);
				
	}
}
