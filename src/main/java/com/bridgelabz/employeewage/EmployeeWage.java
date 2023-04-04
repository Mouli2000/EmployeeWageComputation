package com.bridgelabz.employeewage;

import java.util.Random;

class EmoployeeWage {

	static int WAGE_PER_HR = 20;
	static int WORKING_DAYS = 20;
	static int TOTAL_WORKING_HRS = 100;
	static int TOTAL_EMP_WAGE = 0;
	
	public static void main(String []args) {
		
		Random random = new Random();
		int empHrs = 0;
		int empDays = 0;
		
		while(empHrs < TOTAL_WORKING_HRS && empDays < WORKING_DAYS) {
			empDays ++;
			int EmployeeCheck = random.nextInt(3);
		
			switch(EmployeeCheck) {
				case 1:
					empHrs = 8;
					break;
			
				case 2 :
					empHrs = 4;
					break;
			
				default : 
					empHrs = 0;
			} 
			TOTAL_WORKING_HRS += empHrs;
			System.out.println("Day : "+empDays+" , Working Hour : "+empHrs);
		}
		TOTAL_EMP_WAGE = TOTAL_WORKING_HRS * WAGE_PER_HR;
		System.out.println("Total Employee Working Hours : "+TOTAL_WORKING_HRS);
		System.out.println("Total Employee Wage : "+TOTAL_EMP_WAGE);
	}
}