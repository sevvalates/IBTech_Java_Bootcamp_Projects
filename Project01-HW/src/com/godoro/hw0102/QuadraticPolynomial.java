package com.godoro.hw0102;

public class QuadraticPolynomial implements MathFunction {

	private double a;
	private double b;
	private double c;
	
	@Override
	public double evaluate(double x) {
		return a*x*x+b*x+c;
	}

}
