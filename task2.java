package task2;

public class task2 {

	public static void swap2Int(int a, int b) {
		System.out.println("a = " + a + ", b = " + b); // выводим исходные значения
		
		a = a - b; // получаем разность a и b
		
		b = a + b; // "присваиваем" b значение a
		
		a = b - a; // "присваиваем" a значение b
		
		System.out.println("a = " + a + ", b = " + b); // выводим результат
	}

}
