package com.nagendra.model;

/**
 * @author nagendra.m
 *
 */
public class SumInput {
	
	private int firstNumber;
	
	private int secondNumber;

	public SumInput() {
		super();
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public String toString() {
		return "SumInput [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + "]";
	}

}
