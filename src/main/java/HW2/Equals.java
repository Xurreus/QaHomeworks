package HW2;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String secondString = scanner.nextLine();

        scanner.close();

        boolean areEqual = firstString.equals(secondString);
        System.out.println("The two strings are " + (areEqual ? "equal." : "not equal."));
    }
}
