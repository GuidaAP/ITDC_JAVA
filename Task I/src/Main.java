import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int sum = number/1000 + number % 10 + number  / 100 % 10 + number / 10 % 10;
		System.out.println(sum);
	    
	}

}
