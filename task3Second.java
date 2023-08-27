package task3;


public class task3Second {

	public static boolean checkPalindrome(String str) {
		str = str.toLowerCase().replaceAll("[^А-Яа-щыэ-яЁёa-zA-Z]", ""); 
		// убираем из строки всё, кроме букв латиницы и киррилицы. Также убираем ь и ъ
		
		String firstStr = ""; // инициализируем строковые переменные
		String secondStr = "";
		if(str.length() % 2 != 0) { // учитываем четность размера строки, чтобы правильно создать подстроки
		firstStr = str.substring(0, str.length() / 2); // создаем подстроку из первой половины строки
		secondStr = str.substring(str.length() / 2 + 1, str.length()); // создаем подстроку из второй половины строки
		}else {
			firstStr = str.substring(0, str.length() / 2);
			secondStr = str.substring(str.length() / 2, str.length());
		}
		boolean isPalindrome = firstStr.equals(new StringBuilder(secondStr).reverse().toString()); 
		// сравниваем содержимое первой подстроки с отзеркаленным (перевернутым) содержимым второй строки
		
		return isPalindrome;
	}

}
