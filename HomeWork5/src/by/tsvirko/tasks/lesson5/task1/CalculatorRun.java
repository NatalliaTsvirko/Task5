package by.tsvirko.tasks.lesson5.task1;

import java.util.Scanner;

public class CalculatorRun {

    private static final String MULTIPLY_OPERATION_NAME = "multiply";
    private static final String SUM_OPERATION_NAME = "sum";
    private static final String SUBTRACTION_OPERATION_NAME = "subtraction";
    private static final String DIVISION_OPERATION_NAME = "division";
    private static final String SQRT_OPERATION_NAME = "sqrt";
    private static final String RESULT = "result: ";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Input operation:");
        String operation = scanner.next();
        if (MULTIPLY_OPERATION_NAME.equals(operation)) {
            int result = Calculator.multiply(firstNumber, secondNumber);
            System.out.println(RESULT + result);
        } else if (SUM_OPERATION_NAME.equals(operation)) {
            int result = Calculator.sum(firstNumber, secondNumber);
            System.out.println(RESULT + result);
        } else if (SUBTRACTION_OPERATION_NAME.equals(operation)) {
            int result = Calculator.subtraction(firstNumber, secondNumber);
            System.out.println(RESULT + result);
        } else if (DIVISION_OPERATION_NAME.equals(operation)) {
            double result = Calculator.division(firstNumber, secondNumber);
            System.out.println(RESULT + result);
        } else if (SQRT_OPERATION_NAME.equals(operation)) {
            double result = Calculator.sqrt(firstNumber, secondNumber);
            System.out.println(RESULT + result);
        } else {
            System.out.println("I don't know this kind of operation.");
        }

    }
}


