package com.your.team13.week4;

public class Calculate { // ��길!
	Customer customer;

	public Calculate(Customer customer) {
		this.customer = customer;
	}

	public double totalRate() {
		double sum = 0;

		if (this.isFamliy_discount()) {
			sum += customer.plan.getbasicMonthlyRate() + (customer.plan.additionalLineRate * 2)
					+ ((customer.getlineNumber() - 3) * 5);
		} else {
			sum += customer.plan.getbasicMonthlyRate()
					+ (customer.plan.additionalLineRate * (customer.getlineNumber() - 1));
		}

		if (this.isOverCalltime()) {
			sum += (customer.getCallTime() - customer.plan.getincludedMinutes())
					* customer.plan.getratePerExcessMinutes();
		}

		return sum;
	}

	public boolean isFamliy_discount() {
		if (customer.getlineNumber() >= 4) {
			return true;
		}

		return false;
	}

	public boolean isOverCalltime() {
		if (customer.getCallTime() - customer.plan.getincludedMinutes() > 0) {
			return true;
		}
		return false;
	}

}