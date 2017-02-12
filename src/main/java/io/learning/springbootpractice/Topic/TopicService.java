package io.learning.springbootpractice.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private ArrayList<Topic> topics = new ArrayList(Arrays.asList(
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

}
