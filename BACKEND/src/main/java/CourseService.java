package com.elearning.service;

import com.elearning.entity.Course;
import com.elearning.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repo;

    // Constructor Injection
    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    // ✅ METHOD NAME FIXED
    public Course createCourse(Course course) {
        return repo.save(course);
    }
}