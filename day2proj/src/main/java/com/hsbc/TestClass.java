package com.hsbc;

public class TestClass {
	public static void main(String[] args) {
		Account obj1 = new Account("6701235", 50000, "SBIN021");
		Savings obj2 = new Savings("5734217", 4000, "SBIN907", 200000);
		Current obj3 = new Current("7463702", 500000, "SBIN9077", "Priyanka");
		// System.out.println("-----Account object------");
		// displayTest(obj1);
		System.out.println("-----Savings Object and Current object------");
		displayTest(obj2, obj3);
		System.out.println("----------------------");

	}

	public static void displayTest(Savings s, Current c) {
		System.out.println(s.display());
		System.out.println(c.display());
	}
}