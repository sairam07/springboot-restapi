package io.learning.springbootpractice.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private ArrayList<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Java","CoreJava","Core Java Description"),
			new Topic("MicrosoftC","CoreC#","Core C# Description"),
			new Topic("SQL","CoreSQL","Core SQL Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		/*for(Topic p : topics){
			if(p.getTpoicID().equalsIgnoreCase(id)){
				return p;
			}
		}*/
		
		return topics.parallelStream().filter(t -> t.getTpoicID().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		Topic topicupdate = topics.stream().filter(t -> t.getTpoicID().equalsIgnoreCase(id)).findFirst().get();
		
		topicupdate.setTopicDescription(topic.getTopicDescription());
		topicupdate.setTopicName(topic.getTopicName());
		topicupdate.setTpoicID(topic.getTpoicID());
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getTpoicID().equalsIgnoreCase(id));
		
	}

}
