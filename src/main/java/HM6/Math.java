package HM6;

public class Math {
        public static double calculateAverage(int num1, int num2) {
            // Check if both numbers are non-negative
            if (num1 >= 0 && num2 >= 0) {
                return (double) (num1 + num2) / 2;
            } else {
                System.out.println("ERROR: Both numbers must be non-negative");
                return Double.NaN; // Return NaN (Not-a-Number) to indicate error
            }
        }

        public static int calculateSum(int num1, int num2) {
            // Check if both numbers are non-negative
            if (num1 >= 0 && num2 >= 0) {
                return num1 + num2;
            } else {
                System.out.println("ERROR: Both numbers must be non-negative");
                return -1; // Return -1 to indicate error
            }
        }
}
