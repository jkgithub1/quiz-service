package com.model;

public class Option {
	 public int id;
	 public int questionId;
	 public String name;
	 public boolean isAnswer;
	public Option(int id, int questionId, String name, boolean isAnswer) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.name = name;
		this.isAnswer = isAnswer;
	}
	 
}
