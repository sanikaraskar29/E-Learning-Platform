package com.elearning.controller;

import com.elearning.entity.Course;
import com.elearning.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    private final CourseService service;

    // ✅ CONSTRUCTOR INJECTION (IMPORTANT FIX)
    public CourseController(CourseService service) {
        this.service = service;
    }

    // GET all courses
    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    // POST create course
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }
}