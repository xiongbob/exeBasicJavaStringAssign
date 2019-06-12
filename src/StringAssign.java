/*
    Write a Java program that assigns your name to a variable and prints
    the variable to the console.
 */

import java.util.Scanner;

public class StringAssign {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name:");

        // String input
        String name = myObj.nextLine();

        // Output input by user
        System.out.println("Name: " + name);
    }
}
