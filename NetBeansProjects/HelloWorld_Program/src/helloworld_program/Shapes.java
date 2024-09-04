/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld_program;

/**
 *
 * @author loure
 */
public class MathOperations {
    public static void main(String[] args) {
        // Fixed numbers
        int number1 = 50;
        int number2 = 20;

        // Perform mathematical operations
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        // Print the results of the operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Calculate the average
        double average = (sum + difference + product + quotient) / 4.0;
        System.out.println("Average: " + average);

        // Print a string based on the average value
        if (average > 100) {
            System.out.println("The average is higher than 100.");
        } else if (average < 100) {
            System.out.println("The average is lower than 100.");
        } else {
            System.out.println("The average is exactly 100.");
        }
    }
}
