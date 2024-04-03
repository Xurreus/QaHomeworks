package HM8;
import java.util.Random;

import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a length: ");
        int length = scanner.nextInt();

        double[] array = createRandomArray(length);

        System.out.println("The generated array is ");
        for (double num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static double[] createRandomArray(int length) {
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}
