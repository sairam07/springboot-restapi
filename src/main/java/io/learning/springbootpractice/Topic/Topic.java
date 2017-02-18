package io.learning.springbootpractice.Topic;

public class Topic {
	private String tpoicID;
	private String topicName;
	private String topicDescription;
	
	
	public Topic(String tpoicID, String topicName, String topicDescription) {
		super();
		this.tpoicID = tpoicID;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	public Topic() {
		super();
	}
	public String getTpoicID() {
		return tpoicID;
	}
	public void setTpoicID(String tpoicID) {
		this.tpoicID = tpoicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	

}
