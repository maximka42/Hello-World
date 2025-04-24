package user.maximka42;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("первое число");
        int num1 = scanner.nextInt();

        System.out.println("второе счисло");
        int num2 = scanner.nextInt();

        System.out.println("действие");
        String action = scanner.nextLine();

        int result;

        switch (action) {

            case "+" -> {
                result = num1 + num2;
            }

            case "-" -> {
                result = num1 - num2;
            }

            case "*" -> {
                result = num1 * num2;
            }

            case "/" -> {
                if (num2 == 0)
                    throw new ArithmeticException("деление на ноль запрещено");

                result = num1 / num2;
            }

            default -> {
                throw new IllegalArgumentException("ты чот не так написал");
            }
        }

            System.out.println("ответ: " + result);
    }
}