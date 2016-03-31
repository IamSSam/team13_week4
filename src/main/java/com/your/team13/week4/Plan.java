package com.your.team13.week4;

public class Plan {

	protected double additionalLineRate; // 추가 회선에 따른 요금
	protected double basicMonthlyRate; // 기본 요금
	protected int includedMinutes; // 기본 제공 시간
	protected double ratePerExcessMinutes; // 초과 시간당 요금

	public Plan() {
		super();
	}

	public double getbasicMonthlyRate() {
		return basicMonthlyRate;
	}

	public void setbasicMonthlyRate(double basicMonthlyRate) {
		this.basicMonthlyRate = basicMonthlyRate;
	}

	public int getincludedMinutes() {
		return includedMinutes;
	}

	public void setincludedMinutes(int includedMinutes) {
		this.includedMinutes = includedMinutes;
	}

	public double getratePerExcessMinutes() {
		return ratePerExcessMinutes;
	}

	public void setratePerExcessMinutes(double ratePerExcessMinutes) {
		this.ratePerExcessMinutes = ratePerExcessMinutes;
	}

	public double getadditionalLineRate() {

		return additionalLineRate;
	}

	public void setadditionalLineRate(double additionalLineRate) {
		this.additionalLineRate = additionalLineRate;
	}

}
