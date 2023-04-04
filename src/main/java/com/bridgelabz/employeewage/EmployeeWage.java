package com.bridgelabz.employeewage;

import java.util.Random;

class EmoployeeWage {

	public static void main(String []args) {
		
		int present = 1;
		Random random = new Random();
		int randomNum = random.nextInt(2);
		
		if(randomNum == present)
			System.out.println("Employee Present");
		else
			System.out.println("Employee Absent");
	}
}
