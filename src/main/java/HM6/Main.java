package HM6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password!!!");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        // Check if password contains at least one letter
        boolean containsLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                containsLetter = true;
                break;
            }
        }
        if (!containsLetter) {
            return false;
        }
        // Check if password contains at least one digit
        boolean containsDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit) {
            return false;
        }
        // Check if password contains at least one special character
        boolean containsSpecial = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                containsSpecial = true;
                break;
            }
        }
        if (!containsSpecial) {
            return false;
        }
        return true;
    }
}
