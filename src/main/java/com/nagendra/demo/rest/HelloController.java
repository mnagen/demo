package com.nagendra.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagendra.model.SumInput;

/**
 * @author nagendra.m
 *
 */
@RestController
public class HelloController {

	/**
	 * @param name - Takes name in the form of String as input
	 * @return - Returns a greeting in the form of String
	 */
	@GetMapping("/greetings")
	public String greetingMethod(String name) {
		return "Hello " + name;
	}
	
	/**
	 * @param firstNumber - The first number for which sum is required
	 * @param secondNumber - The second number for which sum is required
	 * @return - Returns the sum of first number and second number
	 */
	@PostMapping("/addTwoNumbers")
	public int addNumbers(SumInput sumInput) {
		return sumInput.getFirstNumber()+ sumInput.getSecondNumber();
	}

}
