package com.calculator;

import java.util.Scanner;

public class Calculator extends MathematicsImpl {

	public void getCalculator() {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("***Welcome to console based application***\n" + "1. Addition of two number\n"
				+ "2. Subtraction of two number\n" + "3. Multiplication of two number\n" + "4. Division of two number\n"
				+ "5. Modulus of two number\n" + "6. Square of number\n" + "7. Cube of number\n"
				+ "8. Average of numbers\n" + "9. Factors of numbers\n" + "10.Find out even or odd number\n"
				+ "Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter first number");
			double a = sc.nextDouble();
			System.out.println("Enter second number");
			double b = sc.nextDouble();
			System.out.println(calculator.addition(a, b));
			break;
		case 2:
			System.out.println("Enter first number");
			double c = sc.nextDouble();
			System.out.println("Enter second number");
			double d = sc.nextDouble();
			System.out.println(calculator.subtraction(c, d));
			break;
		case 3:
			System.out.println("Enter first number");
			double e = sc.nextDouble();
			System.out.println("Enter second number");
			double f = sc.nextDouble();
			System.out.println(calculator.multiplication(e, f));
			break;
		case 4:
			System.out.println("Enter first number");
			double g = sc.nextDouble();
			System.out.println("Enter second number");
			double h = sc.nextDouble();
			System.out.println(calculator.division(g, h));
			break;
		case 5:
			System.out.println("Enter first number");
			double i = sc.nextDouble();
			System.out.println("Enter second number");
			double j = sc.nextDouble();
			System.out.println(calculator.modulus(i, j));
			break;
		case 6:
			System.out.println("Enter number");
			double k = sc.nextDouble();
			System.out.println(calculator.square(k));
			break;
		case 7:
			System.out.println("Enter number");
			double l = sc.nextDouble();
			System.out.println(calculator.cube(l));
			break;
		case 8:
			System.out.println("Enter first number");
			double m = sc.nextDouble();
			System.out.println("Enter second number");
			double n = sc.nextDouble();
			System.out.println("Enter third number");
			double o = sc.nextDouble();
			System.out.println("Enter fourth number");
			double p = sc.nextDouble();
			System.out.println("Enter fifth number");
			double q = sc.nextDouble();
			System.out.println(calculator.average(m, n, o, p, q));
			break;
		case 9:
			System.out.println("Enter number");
			double r = sc.nextDouble();
			calculator.factors(r);
			break;
		case 10:
			System.out.println("Enter number");
			int s = sc.nextInt();
			calculator.evenOrOdd(s);
		}
	}

}
