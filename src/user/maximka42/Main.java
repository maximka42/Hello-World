package user.maximka42;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // получаем первое число
        System.out.println("первое число");
        int num1 = scanner.nextInt();

        // получаем второе число
        System.out.println("второе счисло");
        int num2 = scanner.nextInt();

        // получаем действие
        System.out.println("действие");
        scanner.nextLine(); // input fix bug
        String action = scanner.nextLine();

        // получаем результат
        int result = getResult(action, num1, num2);

        // выводим результат
        System.out.println("ответ: " + result);
    }

    private static int getResult(String action, int num1, int num2) {
        int result;

        switch (action) {

            case "+" -> result = num1 + num2;

            case "-" -> result = num1 - num2;

            case "*" -> result = num1 * num2;

            case "/" -> {
                if (num2 == 0)
                    throw new ArithmeticException("деление на ноль запрещено");

                result = num1 / num2;
            }

            default -> throw new IllegalArgumentException("ты чот не так написал");
        }

        return result;
    }
}