import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("������� ������ �����: ");
		int firstNumber = scanner.nextInt();
		System.out.println("������� ������ �����: ");
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
		System.out.printf("������ ����� %d ������ ������� ����� %d.",
				           firstNumber, secondNumber );
	    } else {
		     if(secondNumber == firstNumber)	{
			 System.out.format("������ ����� %d ����� ������u ����� %d.",
					secondNumber, firstNumber);
		}
	}
		
		System.out.format("������ ����� %d ������ ��� ����� ������� ����� %d.",
				secondNumber, firstNumber);
	} else {
	
		System.out.format("������ ����� %d ����� ������� ����� %d.",
				secondNumber, firstNumber);
	}
}
	
			

