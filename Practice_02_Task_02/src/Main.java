import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Первое значение? ");
		int a = scanner.nextInt();
		System.out.print("Второе  значение? ");
		int b = scanner.nextInt();
		
		System.out.printf("До перестановки без доп. переменной:a = %d; b = %d; \n", a,b);
		
		a = a + b;   //		a +=b
		b = a - b;   //		b = a - b;
		a = a - b;   //		b -= b;
		
		System.out.printf("До перестановки без доп. переменной: a = %d; b = %d;\n", a, b);
		
	}

}
