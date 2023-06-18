package com.dodos.boot1.lear01bootaaa;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dodos")
public class Course2 {
	private int id;
	private String name;
	private String subject;
	
	public Course2(int id, String nameS, String subject) {
		super();
		this.id = id;
		this.name = nameS;
		this.subject = subject;
	}
	
	public Course2() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+subject;
	}
	
	
	
	
	

}
