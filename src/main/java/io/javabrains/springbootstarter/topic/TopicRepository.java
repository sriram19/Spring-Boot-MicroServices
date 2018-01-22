package io.javabrains.springbootstarter.topic;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

//entity - topic, id - primary key
public interface TopicRepository extends CrudRepository<Topic, String>{
	

	
}
