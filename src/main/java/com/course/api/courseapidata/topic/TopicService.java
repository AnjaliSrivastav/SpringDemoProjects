package com.course.api.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;
    
    //to get all topics
    public List<Topic> getAllTopics(){
        List<Topic> topicList = new ArrayList<>();
        topicRepository.findAll().forEach(topicList ::add);
        return topicList;
    }

    //to get a single Topic
    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    //adding a new Topic
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    //updating a new Topic
    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    //delete a topic
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
}
