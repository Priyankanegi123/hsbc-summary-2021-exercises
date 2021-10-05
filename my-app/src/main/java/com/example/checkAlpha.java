package com.example;

public class checkAlpha {

	public static void main(String[] args) {
		char ch = 'a';
		check(ch);
	}

	public static void check(char ch) {
		if (Character.isLetter(ch) == true) {
			System.out.println(ch + " is an alphabet");
		} else {
			System.out.println(ch + " is not an alphabet");

		}
	}
}
