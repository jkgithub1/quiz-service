package com.model;

import java.util.List;

public class Question {
	public int id;
    public String name;
    public int questionTypeId;
    public List<Option> options;
    public QuestionType questionType;
	public Question(int id, String name, int questionTypeId, List<Option> options, QuestionType questionType) {
		super();
		this.id = id;
		this.name = name;
		this.questionTypeId = questionTypeId;
		this.options = options;
		this.questionType = questionType;
	}
    
}
