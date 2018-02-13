import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		
		System.out.println("The next number for the number " + numeric + " is " + (numeric+1) + ".");
		System.out.println("The previous number for the number " + numeric + " is " + (numeric-1) + ".");
				
	}

}
