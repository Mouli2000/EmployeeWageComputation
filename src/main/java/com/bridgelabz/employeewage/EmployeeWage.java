package com.bridgelabz.employeewage;

import java.util.Random;

class EmoployeeWage {

	static int WAGE_PER_HR = 20;
	static int FULL_DAY_HR = 8;
	static int PRESENT = 1;
	static int DAILY_WAGE = 0;
	
	public static void main(String []args) {
		
		Random random = new Random();
		int randomNum = random.nextInt(2);
		
		if(randomNum == PRESENT) {
			System.out.println("Employee Present");
			DAILY_WAGE = WAGE_PER_HR * FULL_DAY_HR;
			System.out.println("Daily Employee Wage is : "+DAILY_WAGE);
		}
		else
			System.out.println("Employee Absent");
	}
}
