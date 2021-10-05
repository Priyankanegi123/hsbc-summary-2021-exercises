package com.example;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range :");
		int start = sc.nextInt();
		int end = sc.nextInt();
		even(start, end);
		odd(start, end);
		sc.close();
	}

	public static void even(int s, int e) {
		System.out.println("Even :");
		for (int i = s; i <= e; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public static void odd(int s, int e) {
		System.out.println("Odd :");
		for (int i = s; i <= e; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
}
