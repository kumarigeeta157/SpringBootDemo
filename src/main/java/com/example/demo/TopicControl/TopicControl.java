package com.example.demo.TopicControl;

import com.example.demo.Topic.Topic;
import com.example.demo.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicControl {

    public TopicControl() {
   }
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopic() {
        return topicService.getAllTopic();
    }

    @RequestMapping(method = RequestMethod.POST, value = "topiccontrol")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="topic/{id}")
    public void deleteTopic(@RequestBody Topic topic,@PathVariable String id){ topicService.deleteTopic(id);}
}