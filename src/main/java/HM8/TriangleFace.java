package HM8;

import java.util.Scanner;

public class TriangleFace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side : ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side : ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side : ");
        double side3 = scanner.nextDouble();

        double face = calculateTriangleFace(side1, side2, side3);
        System.out.println("The face of the triangle is: " + face);

        scanner.close();
    }

    public static double calculateTriangleFace(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double face = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return face;
    }
}
