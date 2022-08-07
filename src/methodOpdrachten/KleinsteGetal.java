package methodOpdrachten;

import java.util.Scanner;

public class KleinsteGetal {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String userInput = "Please enter a number";
        System.out.println(userInput);
        int a = kbd.nextInt();

        System.out.println(userInput);
        int b = kbd.nextInt();

        System.out.println(userInput);
        int c = kbd.nextInt();

        System.out.println("the lowest value is: " + smallNumber(a,b,c));

    }

    public static int smallNumber(int number1, int number2, int number3) {
        int smallestNumber = number1;
        if (smallestNumber > number2)
            smallestNumber = number2;
            if (smallestNumber > number3)
                smallestNumber = number3;

                return smallestNumber;
            }
        }


