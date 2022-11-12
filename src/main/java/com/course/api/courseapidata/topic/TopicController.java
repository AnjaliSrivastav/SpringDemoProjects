package com.course.api.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    //to get all topics using default HTTP GET method
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
         return topicService.getAllTopics();
    }

    //to get single topic using default HTTP GET method
    @RequestMapping("/topics/{id}")
    public Topic getAllTopics(@PathVariable String id){
        return topicService.getTopic(id);
    }

    //to add a topic using  HTTP POST method
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //to update a topic using  HTTP PUT method
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id,@RequestBody Topic topic){
               topicService.updateTopic(id,topic);
    }

    //to delete a topic using  HTTP DELETE method
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
               topicService.deleteTopic(id);
    }
}
