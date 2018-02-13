 import java.util.Scanner;

   public class Main {
	
     public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour_1 = scanner.nextInt();
		int min_1  = scanner.nextInt();
		int sec_1  = scanner.nextInt();
		
		int hour_2 = scanner.nextInt();
		int min_2  = scanner.nextInt();
		int sec_2  = scanner.nextInt();
		
		int result_sec_firs= 3600*hour_1 + 60*min_1 + sec_1;
		int result_sec_second= 3600*hour_2 + 60*min_2 + sec_2;
		
		int difference = result_sec_second - result_sec_firs;
		
		System.out.println(difference);
	}

}
