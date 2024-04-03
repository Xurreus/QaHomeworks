package HM6;

public class PasswordChecker {

    public static boolean isValidPassword(String password) {
        // Check if password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        // Check if password contains at least one letter, digit, and special character
        if (!password.matches(".*[a-zA-Z].*") || !password.matches(".*\\d.*") || !password.matches(".*[!@#$%^&*()-_=+|{}\\[\\]:;\"'<>,.?/].*")) {
            return false;
        }
        return true;
    }
}

