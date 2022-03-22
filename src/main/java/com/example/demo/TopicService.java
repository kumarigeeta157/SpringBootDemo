package com.example.demo;

import com.example.demo.Topic.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {


    public static List<Topic>getAllTopic(){
//        List<Topic> asList = null;
        return Arrays.asList(
                new Topic("spring","spring-boot","spring-framework")
        );
    }

    @RequestMapping
    public void addTopic(){

    }

    public void addTopic(Topic topic) {
        addTopic(topic);
    }
}