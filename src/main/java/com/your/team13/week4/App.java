package com.your.team13.week4;

import java.util.Scanner;

public class App {

	private App() {

	}

	public static void main(String[] args) {
		String inputPlan;
		int calltime;
		int lineNumber;

		Plan plan = null;
		Calculate calculate;
		Customer customer;

		Scanner sc = new Scanner(System.in);

		System.out.print("Plan : ");
		inputPlan = sc.next().toLowerCase();

		if ("gold".equals(inputPlan)) {
			plan = new Gold();
		} else if ("silver".equals(inputPlan)) {
			plan = new Silver();
		}

		System.out.print("총사용시간 : ");
		calltime = sc.nextInt();

		System.out.print("사용회선 : ");
		lineNumber = sc.nextInt();

		sc.close();

		customer = new Customer(plan, calltime, lineNumber);
		calculate = new Calculate(customer);

		System.out.printf("금액 : %.2f", calculate.total_rate());
	}
}
