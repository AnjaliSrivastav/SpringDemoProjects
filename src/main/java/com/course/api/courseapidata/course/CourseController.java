package com.course.api.courseapidata.course;

import com.course.api.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    //to get all topics using default HTTP GET method
    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId){
         return courseService.getAllCourses(topicId);
    }

    //to get single topic using default HTTP GET method
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    //to add a topic using  HTTP POST method
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addTopic(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    //to update a topic using  HTTP PUT method
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateTopic(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    //to delete a topic using  HTTP DELETE method
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id){
               courseService.deleteCourse(id);
    }
}
