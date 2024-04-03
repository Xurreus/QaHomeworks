package HM6;

public class NumberChecker {
    public static boolean arePositiveAndEqual(int num1, int num2, int num3) {
        // Check if all numbers are positive and equal
        if (num1 > 0 && num2 > 0 && num3 > 0 && num1 == num2 && num2 == num3) {
            return true;
        } else {
            return false;
        }
    }
}
