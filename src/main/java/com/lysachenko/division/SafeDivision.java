package com.lysachenko.division;

import java.util.Scanner;

public class SafeDivision {

    private final Scanner scanner = new Scanner(System.in);

    public void division() {

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = 0;
        double result = 0;

        while (b == 0) {
            b = scanner.nextInt();
            try {
                result = a / b;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Error! Divide by 0!");
                System.out.print("Please, reenter second number: ");
            }
        }
        System.out.println("Result of division: " + result);
    }
}
