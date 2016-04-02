package com.your.team13.week4;

public class Customer {

	private int lineNumber;
	private int calltime;

	protected Plan plan;

	public Customer(Plan plan, int calltime, int lineNumber) {
		this.plan = plan;
		this.calltime = calltime;
		this.lineNumber = lineNumber;
	}

	public int getlineNumber() {
		return lineNumber;
	}

	public void setlineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getCallTime() {
		return calltime;
	}

	public void setCallTime(int calltime) {
		this.calltime = calltime;
	}

}