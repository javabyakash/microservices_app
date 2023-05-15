package in.javabyakash.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.javabyakash.model.Course;

@FeignClient("COURSE-SERVICE")
public interface ICourseRestConsumer {
	
	@GetMapping("/info")
	public ResponseEntity<String> getCourseInfo();
	
	@GetMapping("/course")
	public ResponseEntity<Course> getCourse();
	
	@GetMapping("/course/{id}")
	public ResponseEntity<String> getCourseById(@PathVariable("id") Integer id);
	
	@GetMapping("/course/all")
	public ResponseEntity<List<Course>> getAllCourse();
}
