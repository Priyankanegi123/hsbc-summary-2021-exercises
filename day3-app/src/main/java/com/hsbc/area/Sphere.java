package com.hsbc.area;

public class Sphere implements Shape {
	double p = 3.14;

	public String getArea(double r) {
		return String.valueOf(4 * p * r * r);
	}

}
