package com.your.team13.week4;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
	private static final Logger logger = Logger.getLogger(App.class.getName());

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

		logger.log(Level.INFO, " Plan : ");
		inputPlan = sc.next().toLowerCase();

		if ("gold".equals(inputPlan)) {
			plan = new Gold();
		} else if ("silver".equals(inputPlan)) {
			plan = new Silver();
		}

		logger.log(Level.INFO, " 총 사용시간 : ");
		calltime = sc.nextInt();

		logger.log(Level.INFO, " 사용회선 : ");
		lineNumber = sc.nextInt();

		sc.close();

		customer = new Customer(plan, calltime, lineNumber);
		calculate = new Calculate(customer);
		
		System.out.printf("금액 : %.2f", calculate.totalRate());
	}
}
