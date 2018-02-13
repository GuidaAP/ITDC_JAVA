import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("Введите вещественное число: ");
		double number = scanner.nextDouble();
		double absoluteNumder = number;
		
		
//		boolean value = false;
		
		// true, false
		// 1      0
		
		if (absoluteNumder < 0 ) {
			absoluteNumder *= -1; // or -absoluteNumder
		
		}
        
		System.out.printf("|%.3f|= %.3f%n", number, absoluteNumder);
	}

}
