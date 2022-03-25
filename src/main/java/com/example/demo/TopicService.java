package com.example.demo;

import com.example.demo.Topic.Topic;
import com.example.demo.TopicControl.TopicControl;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {
    public TopicService() {
    }

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(

                new Topic("spring", "spring-boot", "spring-framework")
        ));

    public List<Topic>getAllTopic() {
        return topicList;
    }

   public Topic getTopic(String id) {
        for(Topic topic : topicList){
            if(topic.getId().equals(id)){
                return topic;
            }
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(String id,Topic topic){
        for(int i=0;i< topicList.size();i++){
            Topic tempTopic = topicList.get(i);
            String tempId = tempTopic.getId();
            if(tempId.equals(id)){
                tempTopic.setName(topic.getName());
                tempTopic.setSurname(topic.getSurname());
                tempTopic.size = topic.size;
                return;
            }
        }
    }
    public void deleteTopic(String id){
        for(int i=0;i< topicList.size();i++){
            if(topicList.get(i).getId().equals(id)) {
                topicList.remove(i);
                return;
            }
        }
    }
}
