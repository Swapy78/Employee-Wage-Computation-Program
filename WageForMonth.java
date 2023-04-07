package calculator;

import java.util.Scanner;

public class WageForMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the wage of an employee");
		int wageofEmployee = sc.nextInt();
		int sum = 0;
		
		System.out.println("Please enter the number of days");
		int numberofDays = sc.nextInt();
		
		for (int i=1; i<=numberofDays; i++) {
			double isPresent = Math.random();
			
			if(isPresent >= 2) {
				sum += wageofEmployee;
				System.out.println("Employee is present");
			}
		
			else if(isPresent >= 1 && isPresent < 2) {
				sum += (wageofEmployee/2);
				System.out.println("Employee is partially present");
			}
			else {
				System.out.println("Employee is absent");
				System.out.println("Employee earned "+0);
					
				}
				
			}
		System.out.println("Employee earned "+sum);
		sc.close();
			
		}

	}



