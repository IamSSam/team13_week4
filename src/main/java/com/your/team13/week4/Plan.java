package com.your.team13.week4;

public class Plan {

	protected double additional_line_rate; // 추가 회선에 따른 요금
	protected double basic_monthly_rate; // 기본 요금
	protected int included_minutes; // 기본 제공 시간
	protected double rate_per_excess_minutes; // 초과 시간당 요금

	public Plan() {

	}

	public double getBasic_monthly_rate() {
		return basic_monthly_rate;
	}

	public void setBasic_monthly_rate(double basic_monthly_rate) {
		this.basic_monthly_rate = basic_monthly_rate;
	}

	public int getIncluded_minutes() {
		return included_minutes;
	}

	public void setIncluded_minutes(int included_minutes) {
		this.included_minutes = included_minutes;
	}

	public double getRate_per_excess_minutes() {
		return rate_per_excess_minutes;
	}

	public void setRate_per_excess_minutes(double rate_per_excess_minutes) {
		this.rate_per_excess_minutes = rate_per_excess_minutes;
	}

	public double getAdditional_line_rate() {

		return additional_line_rate;
	}

	public void setAdditional_line_rate(double additional_line_rate) {
		this.additional_line_rate = additional_line_rate;
	}

}
