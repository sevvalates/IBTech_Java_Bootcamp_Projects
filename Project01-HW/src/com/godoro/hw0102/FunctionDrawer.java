package com.godoro.hw0102;

public class FunctionDrawer {
	
	void draw(MathFunction function, double x1, double x2, int n) {
		//x1 den x2 ye kadar n nokta ciz
		
		double dx = (x1-x2)/n;
		double y;
		
		for(double x=x1 ; x<=x2 ; x+=dx) {
			y=function.evaluate(x);
			System.out.println("x: "+x+" y:"+y);
		}
		
	}
}
