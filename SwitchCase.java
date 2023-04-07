package calculator;

import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double isPresent = Math.random();
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the wage of an employee");
		int wageofEmployee = sc.nextInt();
		int sum = 0;
		
		System.out.println("Please enter the number of days");
		int numberofDays = sc.nextInt();
		
		
	switch(sum) {
	case 1:
		  System.out.println("Employee is present ");
		case 2:
		  System.out.println("Employee is partially present");
	        default:
		  System.out.println("Employee is absent");

	}

}
}
