import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� �������� ������� � (cm): ");
		int signA = scanner.nextInt(); 
		
		System.out.println("������� �������� ������� b (cm): ");
		int signB = scanner.nextInt();
		
		System.out.println("������� �������� ������� c (cm): ");
		int signC = scanner.nextInt();
		
		int volume = signA * signB * signC;
		
		System.out.println("����� ��������������� " + "(" + signA + " x " 
				+ signB + " x " + signC + ")" + " ����� " + volume + 
				" cm2");
		
//		System.out.println("����� ��������������� " + "(" + signA + " x " 
//		+ signB + " x " + signC + ")" + " ����� " + volume + 
//		"cm" toUpperCase("2");
//		
	}

}
