import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("¬ведите первое число: ");
		int firstNumber = scanner.nextInt();
		System.out.println("¬ведите второе число: ");
		int secondNumber = scanner.nextInt();
		
		// TODO 
		// == , 
		// != NOT equals
		// < less than
		// > greater than
		// <= less than or equals
		// >= greater  than or equals
		
		//             <=
		//              |123
		if (firstNumber > secondNumber) {
		System.out.printf("ѕервое число %d больше второго числа %d.",
				           firstNumber, secondNumber );
	    } else {
		     if(secondNumber == firstNumber)	{
			 System.out.format("ѕервое число %d равно второгu числа %d.",
					secondNumber, firstNumber);
		}
	}
		
		System.out.format("¬торое число %d больше или равно первого числа %d.",
				secondNumber, firstNumber);
	} else {
	
		System.out.format("¬торое число %d равно первого числа %d.",
				secondNumber, firstNumber);
	}
}
	
			

