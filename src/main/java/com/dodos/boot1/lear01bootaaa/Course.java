package com.dodos.boot1.lear01bootaaa;

public class Course {
	private long id;
	private String name;
	private String subject;

	public Course(long id, String nameS, String subject) {
		super();
		this.id = id;
		this.name = nameS;
		this.subject = subject;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
