
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вариант первый
		
		System.out.println("***********");
		System.out.println("*Привет Мир!*");
		System.out.println("***********"); 
		
		// Вариант второй (плохой с точки зрения стиля)
		
			System.out.println("*********\n*Привет Мир!*\n*********");
		
		
		// Вариант третий (минимализация вызовов путем конкатенации строк)
		
				System.out.println(
				"*************\n" +
				"*Привет Мир!*\n" +
				"*************");
	}

}
