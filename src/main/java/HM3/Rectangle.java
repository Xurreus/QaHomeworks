package HM3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.println("Please enter the height of the rectangle: ");
        int height = scanner.nextInt();

        int perimeter = 2 * (length + height);
        int area = length * height;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}