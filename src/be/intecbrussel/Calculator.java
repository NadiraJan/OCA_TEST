package be.intecbrussel;

public class Calculator {


    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double substraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        return number1 / number2;
    }

    public static void printResult(double result) {
        System.out.println("The result is " + result);

    }
}
