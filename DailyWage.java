package calculator;

public class DailyWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wagePerHour = 20;
		int hoursPerDay = 8;
		
		double isPresent = Math.random();
		
		int dailyWage = 20*8;
		
		if(isPresent >= 0.5) {
			
			System.out.println("Employee is present");
			System.out.println("Daily wage is "+dailyWage);
		}
	
	else {
		System.out.println("Employee is absent");
	}
		
	}

}
