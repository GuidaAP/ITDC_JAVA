import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int mins = scanner.nextInt();
//        int mins = 0;
      
        
        int digital_time_hours = mins / 60;
        int digital_time_min  = mins % 60;

        
        System.out.println(digital_time_hours + " " + digital_time_min);
        
		
		
		
	}

}
