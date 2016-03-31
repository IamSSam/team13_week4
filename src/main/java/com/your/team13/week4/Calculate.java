package com.your.team13.week4;

public class Calculate { // 계산 !
	Customer customer;

	public Calculate(Customer customer) {
		this.customer = customer;
	}

	public double total_rate() {
		double sum = 0;
		// sum = sum + c.plan.getBasic_monthly_rate();
		if (customer.plan instanceof Gold) {

		} else if (customer.plan instanceof Silver) {

		}

		return sum;
	}

	public boolean is_famliy_discount() {
		if (customer.getLine_number() >= 4)
			return true;
		else
			return false;
	}

}