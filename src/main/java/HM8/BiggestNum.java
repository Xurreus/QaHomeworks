package HM8;

import java.util.Scanner;

public class BiggestNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int biggestNumber = Math.max(number1, Math.max(number2, number3));
        System.out.println("The largest number out of the three is " + biggestNumber);

        scanner.close();
    }
}