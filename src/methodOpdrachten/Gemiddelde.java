package methodOpdrachten;

import java.util.Scanner;

public class Gemiddelde {
    public static void main(String[] args) {


        Scanner kbd = new Scanner(System.in);
        final String userInput = "Please enter a number";
        System.out.println(userInput);
        int a = kbd.nextInt();

        System.out.println(userInput);
        int b = kbd.nextInt();

        System.out.println(userInput);
        int c = kbd.nextInt();

        System.out.println("the average is: " + average(a, b, c));

    }

    public static double average(int number1, int number2, int number3) {
        return (number1 + number2 + number3)/3;


    }
}



