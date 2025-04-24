package com.itproger;

  import java.util.Scanner;

public class Main {


    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

        System.out.println("первое число");
       int num1 = scanner.nextInt();

        System.out.println("второе счисло");
       int num2 = scanner.nextInt();

       int res;

        System.out.println("действие");
        Scanner actionScanner = new Scanner(System.in);
        String action = actionScanner.nextLine();

        switch (action) {

            case"+":
                res = num1 + num2;
                System.out.println("ответ " + res);
                break;

            case"-":
                res = num1 - num2;
                System.out.println("ответ " + res);
                break;

            case"*":
                res = num1 * num2;
                System.out.println("ответ " + res);
                break;

            case"/":
                if (num2 == 0) {
                    System.out.println("на ноль делить нельзя");

                }else {
                  res = num1 / num2;
                System.out.println("ответ " + res);
                }
                break;

            default:
                System.out.println("ты чот не так написал");




        }









    }

}