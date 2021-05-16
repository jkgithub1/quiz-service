package com.model;

import java.util.List;

public class Quiz {
	 public int id;
	 public String name;
	 public String description;
	 public List<Question> questions;
	public Quiz(int id, String name, String description, List<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.questions = questions;
	}
	 
}
