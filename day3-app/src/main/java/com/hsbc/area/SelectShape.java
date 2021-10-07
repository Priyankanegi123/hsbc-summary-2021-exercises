package com.hsbc.area;

public class SelectShape {
	public static void main(String[] args) {

		System.out.println("Circle instance");
		Circle c = new Circle();
		FindArea.printArea(c);

		System.out.println("Sphere instance");
		Sphere s = new Sphere();
		FindArea.printArea(s);

	}

}
