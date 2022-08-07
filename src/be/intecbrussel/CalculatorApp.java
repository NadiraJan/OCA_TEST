package be.intecbrussel;

public class CalculatorApp {
    public static void main(String[] args) {

        double number1 = 100.50;
        double number2 = 50.00;

        double result = Calculator.addition(number1, number2);
        Calculator.printResult(result);

        result = Calculator.substraction(number1, number2);
        Calculator.printResult(result);

        result = Calculator.multiplication(number1, number2);
        Calculator.printResult(result);

        result = Calculator.division(number1, number2);
        Calculator.printResult(result);
    }
}
