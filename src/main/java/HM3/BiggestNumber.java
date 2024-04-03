package HM3;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int biggestNumber = number1;

        if (number2 > biggestNumber) {
            biggestNumber = number2;
        }

        if (number3 > biggestNumber) {
            biggestNumber = number3;
        }

        System.out.println("The largest number is: " + biggestNumber);
    }
}


