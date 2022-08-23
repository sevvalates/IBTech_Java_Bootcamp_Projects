package com.godoro.enums;

public class DayTest {
	
	public static void printDay(Day day) {
		switch(day) {
		case MONDAY:
			System.out.println("Pazartesi");
			break;
		case TUESDAY:
			System.out.println("Sali");
			break;
		case WEDNESDAY:
			System.out.println("Pazartesi");
			break;
		default:
			System.out.println("Gecersiz gun duzgusu!");
		}
	}

	public static void main(String[] args) {
		Day day=Day.TUESDAY;
		printDay(day);
		printDay(Day.TUESDAY);
	}

}
