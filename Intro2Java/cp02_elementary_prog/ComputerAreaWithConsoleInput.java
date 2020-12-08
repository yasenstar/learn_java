// package Intro2Java.cp02_elementary_prog;

import java.util.Scanner; // Scanner is in the java.util package

public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // nextByte(), nextShort(), nextInt(), nextLong(),
        // nextFloat(), nextDouble(), next(), nextLine()

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radium: ");
        double radius = input.nextDouble();

        // Computee area
        double area = radius * radius * 3.1415926;

        // Display results
        System.out.println("The radius you input is: " + radius + "\nThe area is " + area);
    }
}
