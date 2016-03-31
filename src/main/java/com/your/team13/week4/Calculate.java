package com.your.team13.week4;

public class Calculate { // ��길!
	Customer customer;

	public Calculate(Customer customer) {
		this.customer = customer;
	}

	public double totalRate() {
		double sum = 0;

		if (this.isFamliyDiscount()) {
			sum += customer.plan.getBasic_monthly_rate() + (customer.plan.additional_line_rate * 2)
					+ ((customer.getLine_number() - 3) * 5);
		} else {
			sum += customer.plan.getBasic_monthly_rate()
					+ (customer.plan.additional_line_rate * (customer.getLine_number() - 1));
		}

		if (this.isOverCalltime()) {
			sum += (customer.getCallTime() - customer.plan.getIncluded_minutes())
					* customer.plan.getRate_per_excess_minutes();
		}

		return sum;
	}

	public boolean isFamliyDiscount() {
		if (customer.getLine_number() >= 4) {
			return true;
		}

		return false;
	}

	public boolean isOverCalltime() {
		if (customer.getCallTime() - customer.plan.getIncluded_minutes() > 0) {
			return true;
		}

		return false;
	}

}