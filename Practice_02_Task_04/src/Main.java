import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double CM_IN_INCHES = 2.54;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� �������� � ������? ");
		
		double inches = scanner.nextDouble();
		double centimetres = inches * CM_IN_INCHES;
		
		System.out.printf("%.2f ����. = %.2f ��.\n", inches, centimetres);
	}

}
