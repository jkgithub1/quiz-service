package com.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  


import com.model.*;
import com.service.*;


@RestController
@CrossOrigin(origins="*")
public class QuizController {

	@Autowired
	private IQuizService quizService;
	
	@GetMapping(value = "/quiz")  
	public Quiz getQuiz()   
	{  
	//finds all the products  
	Quiz quiz = quizService.findAll();  
	//returns the product list  
	return quiz;  
	}  
	
}
