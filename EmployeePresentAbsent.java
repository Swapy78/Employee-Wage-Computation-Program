package calculator;

public class EmployeePresentAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			double isPresent = Math.random();
			
			if(isPresent >= 0.5) {
				
				System.out.println("Employee is present");
			}
		
		else {
			System.out.println("Employee is absent");
		}
	}

}
