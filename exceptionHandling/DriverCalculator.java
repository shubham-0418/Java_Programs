package com.exceptionHandling;


class InvalidInputException extends Exception {
public InvalidInputException(String message) {
super(message);
}
}

class DivisionByZeroException extends Exception {
public DivisionByZeroException(String message) {
super(message);
}
}

class InvalidMultiplierException extends Exception {
public InvalidMultiplierException(String message) {
super(message);
}
}

class Calculator {
public static double add(double a, double b) {
return a + b;
}

public static double subtract(double a, double b) {
return a - b;
}

public static double multiply(double a, double b) throws InvalidMultiplierException {
if (a == 0 || a == 1 || b == 0 || b == 1) {
throw new InvalidMultiplierException("Invalid multiplier or multiplicand.");
}
return a * b;
}

public static double divide(double numerator, double denominator) throws DivisionByZeroException {
if (denominator == 0) {
throw new DivisionByZeroException("Division by zero is not allowed.");
}
return numerator / denominator;
}
}

public class DriverCalculator {
public static void main(String[] args) {
try {
double a = 10;
double b = 0;

double sum = Calculator.add(a, b);
double substraction = Calculator.subtract(a, b);
double product = Calculator.multiply(a, b);
double division = Calculator.divide(a, b);

System.out.println("Sum: " + sum);
System.out.println("substraction: " + substraction);
System.out.println("Product: " + product);
System.out.println("Division : " + division);
} catch (InvalidMultiplierException | DivisionByZeroException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
