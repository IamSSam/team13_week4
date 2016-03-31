package com.your.team13.week4;

public class Customer {

	// optional
	// private String name;
	// private String address;
	// private String period_of_payment;
	
	private int line_number;  
	private int calltime;  

	protected Plan plan; 

	// public Customer(String name, String address, String period_of_payment,
	// Plan plan, int line_number, int time) {
	// // this.name = name;
	// // this.address = address;
	// // this.period_of_payment = period_of_payment;
	// this.plan = plan;
	// this.line_number = line_number;
	// this.calltime = time;
	// }

	public Customer(Plan plan, int calltime, int line_number) {
		this.plan = plan;
		this.calltime = calltime;
		this.line_number = line_number;
	}

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }

	public int getLine_number() {
		return line_number;
	}

	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}

	public int getCallTime() {
		return calltime;
	}

	public void setCallTime(int calltime) {
		this.calltime = calltime;
	}

}