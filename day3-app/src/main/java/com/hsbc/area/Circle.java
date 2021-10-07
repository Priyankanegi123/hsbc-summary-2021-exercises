package com.hsbc.area;

public class Circle implements Shape {
	double p = 3.14;

	public String getArea(double r) {
		return String.valueOf(p * r * r);

	}

}
