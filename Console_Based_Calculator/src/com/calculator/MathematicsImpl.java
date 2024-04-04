package com.calculator;

public class MathematicsImpl implements Mathematics {

	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		return a / b;
	}

	@Override
	public double modulus(double a, double b) {
		return a % b;
	}

	@Override
	public double square(double a) {
		return a * a;
	}

	@Override
	public double cube(double a) {
		return a * a * a;
	}

	@Override
	public double average(double a, double b, double c, double d, double e) {
		return (a + b + c + d + e) / 5;
	}

	@Override
	public void factors(double a) {
		for (int i = 1; i <= a; i++) {
			if (a % (i) == 0) {
				System.out.print(i + " ");
			}
		}
	}

	@Override
	public void evenOrOdd(int a) {
		if (a != 1 && a % 2 == 0) {
			System.out.println(a + " is even number.");
		} else {
			System.out.println(a + " is odd number");
		}
	}

}
