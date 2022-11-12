package com.course.api.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    
    //to get all courses for a particular topicId
    public List<Course> getAllCourses(String topicId){
        List<Course> courseList = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courseList::add);
        return courseList;
    }

    //to get a single course
    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    //adding a new Course
    public void addCourse(Course course){
        courseRepository.save(course);
    }

    //updating a new Course
    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    //delete a course
    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}
