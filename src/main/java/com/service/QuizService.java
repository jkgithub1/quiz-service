package com.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.model.*;

@Service
public class QuizService implements IQuizService {

	@Override
	public Quiz findAll() {
		QuestionType qt = new QuestionType(1, "Multiple Choice", true);
		
		ArrayList<Question> questions =  new ArrayList<Question>();
		//Q1
		ArrayList<Option> options =  new ArrayList<Option>();
		options.add(new Option(1055,1010,"<javascript>",false));
		options.add(new Option(1056,1010,"<script>",true));
		options.add(new Option(1057,1010,"<js>",false));
		options.add(new Option(1058,1010,"<None of the above>",false));
		questions.add(new Question(1010,"Which HTML tag do we use to put the JavaScript?",1,options,qt));
		//Q2
		ArrayList<Option> options1 =  new ArrayList<Option>();
		options1.add(new Option(1055,1010,"while()",false));
		options1.add(new Option(1057,1010,"loop",false));
		options1.add(new Option(1056,1010,"forEach",true));
		options1.add(new Option(1058,1010,"takeUntil",false));
		questions.add(new Question(1011,"Which built-in method calls a function for each element in the array?",1,options1,qt));
		//Q3
		ArrayList<Option> options2 =  new ArrayList<Option>();
		options2.add(new Option(1055,1010,"let has local scope",true));
		options2.add(new Option(1057,1010,"Both are same",false));
		options2.add(new Option(1056,1010,"var is new data type",false));
		options2.add(new Option(1058,1010,"let consumes more cpu and ram",false));
		questions.add(new Question(1012,"What is the difference between let and var?",1,options2,qt));
		//Q4
		ArrayList<Option> options3 =  new ArrayList<Option>();
		options3.add(new Option(1055,1010,"A Language based on Javascript",true));
		options3.add(new Option(1057,1010,"script that runs on browser",false));
		options3.add(new Option(1056,1010,"A DataType Collection of Javascript",false));
		options3.add(new Option(1058,1010,"None of the above",false));
		questions.add(new Question(1013,"What is TypeScript?",1,options3,qt));
		//Q5
		ArrayList<Option> options4 =  new ArrayList<Option>();
		options4.add(new Option(1055,1010,"a -> { return b; }",false));
		options4.add(new Option(1057,1010,"x <= x + y;",false));
		options4.add(new Option(1056,1010,"x <- x + 5;",false));
		options4.add(new Option(1058,1010,"x => x + 5;",true));
		questions.add(new Question(1014,"Which of the following is right syntex for arrow function?",1,options4,qt));

		return new Quiz(1,"JavaScript Quiz","JavaScript Quiz (Basic Multiple Choice Questions for JavaScript Developers)",questions);
	}

}
