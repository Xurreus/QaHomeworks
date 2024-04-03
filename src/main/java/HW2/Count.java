package HW2;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String stringWithWords = scanner.nextLine();

        String[] words = stringWithWords.split("\\s+");
        int wordCount = words.length;

        System.out.println("Your text's word count is: " + wordCount);

        scanner.close();
    }
}
