import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int nextEven = number - number %2 + 2;
		 
		System.out.println(nextEven);
		
		
	}

}
