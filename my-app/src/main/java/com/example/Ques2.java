package com.example;

public class Ques2 {
	public static void main(String[] args) {
		//traditional for loop
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		//enhanced for loop
		for(String i:args) {
			System.out.println(i);	
		}
	}
}