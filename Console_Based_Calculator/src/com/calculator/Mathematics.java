package com.calculator;

public interface Mathematics {
	
	// addition() method for adding two numbers.
	public double addition(double a, double b);

	// subtraction() method for subtracting two numbers.
	public double subtraction(double a, double b);

	// multiplication() method for multiplying two numbers.
	public double multiplication(double a, double b);

	// division() method for dividing two numbers.
	public double division(double a, double b);

	// modulus() method for calculating modulus of two numbers.
	public double modulus(double a, double b);

	// square() method for getting square of number.
	public double square(double a);

	// cube() method for getting cube of number.
	public double cube(double a);

	// average() method for calculating average of five numbers.
	public double average(double a, double b, double c, double d, double e);

	// factors() method for calculating factors of number.
	public void factors(double a);

	// evenOrOdd() method returning the type of number weither even or false.
	public void evenOrOdd(int a);

}
