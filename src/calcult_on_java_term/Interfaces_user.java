package calcult_on_java_term;
import java.util.Scanner;

public class Interfaces_user {

	public static float number1;
	public static float number2;
	public static int int_user_answer = 0;
	public static String error;
	public static Scanner scan = new Scanner(System.in);
	public static void main(String [] arge) {
		System.out.print("Ведите первое число в вычеслении: ");
		Interfaces_user.number1 = scan.nextFloat();
		Interfaces_user.interface_user();
	}
	public static void interface_user() {
		System.out.print("Ведите втророе числе в вычеслении: ");
		Interfaces_user.number2 = scan.nextFloat();
		System.out.print("1. Вычитание\n2. Деление\n3. Нахождение остатка при делении\n4. Сложение\n5. Умножение\n6. Возедение в корень\n:: Выбирете действие (1-6):\n::  ");
		Interfaces_user.int_user_answer = scan.nextInt();
		Calculation.calcult();
		System.out.print("Результат: " + Calculation.result + "\nНачать вычесление с результатом? [y/n] ");
		String String_user_answer = scan.next();
		System.out.print(String_user_answer);
		if (String_user_answer == "y" | String_user_answer == "Y") {
			System.out.print(1);
			Interfaces_user.interface_user();
		}
		if (String_user_answer == "n" | String_user_answer == "N") {
			System.out.print(2);
			return;
		}
		/*else {
			Interfaces_user.error = "::Ответ не понятен (надо было написать y (что означает, что вы согласны) или n (вы не согласны))";
			Interfaces_user.answer_error();
		}*/
	}
	public static void answer_error() {
		System.out.println("Ошибка: " + Interfaces_user.error + ". Перезагрузка программы...");
		Interfaces_user.main(null);
	}

}
