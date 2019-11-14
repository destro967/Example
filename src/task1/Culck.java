package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Culck {
    public static void main(String[] args) {
        float number1, number2;
        int menu;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("a = ");
            number1 = scanner.nextFloat();

            System.out.print("b = ");
            number2 = scanner.nextFloat();

            loop1:
            System.out.println("chose action:\n" +
                    "1) +\n" +
                    "2) -\n" +
                    "3) /\n" +
                    "4) *\n" +
                    "5) %\n" +
                    "6) exit");

            menu = 0;

            loop1:
            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("try again");
                scanner.next();
                break loop1;
            }
            try {

                for (; ; ) {
                    switch (menu) {
                        case 1:
                            System.out.println("rez = " + (number1 + number2));
                            throw new Exception();
                        case 2:
                            System.out.println("rez = " + (number1 - number2));
                            throw new Exception();
                        case 3:
                            System.out.println("rez = " + (float) (number1 / number2));
                            throw new Exception();
                        case 4:
                            System.out.println("rez = " + (number1 * number2));
                            throw new Exception();
                        case 5:
                            System.out.println("rez = " + (number1 % number2));
                            throw new Exception();
                        case 6:
                            System.out.println("bay");
                            throw new Error("exit");
                        default:
                            System.out.println("chose action:\n" +
                                    "1) +\n" +
                                    "2) -\n" +
                                    "3) /\n" +
                                    "4) *\n" +
                                    "5) %\n" +
                                    "6) exit");
                            try {
                                menu = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("try again");
                                scanner.next();
                            } finally {
                                break;
                            }
                    }
                }
            }catch (Exception e){}
        }
    }
}
