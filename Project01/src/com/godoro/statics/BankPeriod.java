package com.godoro.statics;

public enum BankPeriod {
	
	PERIOD_SEASON(3),
	PERIOD_HALF(6),
	PERIOD_3Q(9),
	PERIOD_YEAR(12);

	private int months;
	
	BankPeriod(int months){
		this.months=months;
	}

	public int getMonths() {
		return months;
	}
	
}
