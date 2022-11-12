package com.course.api.courseapidata.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //find all the courses which has the name given in input
    public List<Course> findByName(String name);

    //find all the courses which has the description given in input
    public List<Course> findByDescription(String description);

   //method which takes a topicId and returns a list of Course
    List<Course> findByTopicId(String topicId);
}