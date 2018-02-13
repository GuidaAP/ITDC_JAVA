
public class Main {

	public static void main(String[] args) {
		
		
		double number = 0.0;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		number += 0.1;
		
		
		
		
		System.out.printf("%f%n", number);  
		if (number == 1.0) {				// if (Math.abs(number - 1) < 0.0001) {
			System.out.println("Equal");
			
		} else {
			System.out.println("Not equal");
		}
		
	}	
}		