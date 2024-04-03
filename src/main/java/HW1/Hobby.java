package HW1;

import java.util.Scanner;

public class Hobby {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.println("What's your hobby? :)");
        String hobby = input.nextLine();

        System.out.println(name + " Cool " + hobby + " is a nice hobby :)");
    }
}
