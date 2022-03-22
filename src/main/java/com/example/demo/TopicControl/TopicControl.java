package com.example.demo.TopicControl;

import com.example.demo.Topic.Topic;
import com.example.demo.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicControl {

//    public TopicControl(){}

//    private String RequestMethod;

    public TopicControl() {
//        RequestMethod = requestMethod;
//        this.TopicService = new TopicService();
    }
    //    private List<Topic> Topic;

//    public TopicControl(Object topicService, List<Topic> topic) {
//        TopicService = topicService;
//        Topic = topic;
//    }
    @Autowired
    private TopicService TopicService;
    @RequestMapping("/topic")
    public List<Topic> getAllTopic() {

        return Arrays.asList(
                new Topic("javascript", "javascript-framework", "javascript-developer"),
                new Topic("java", "spring-boot", "java-developer"));
    }
//    @RequestMapping("/Topic/{Id}")
//   public Topic getTopic(@PathVariable String Id) {
//     return TopicService.getAllTopic().get(Id);
//    }

    @RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST,value="Topic")
    public void addTopic(@RequestBody Topic topic,@PathVariable String Id){
        TopicService.addTopic( topic);
    }
}
