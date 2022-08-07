package methodOpdrachten;

import java.util.Scanner;

public class EvenGetal {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = kbd.nextInt();

        System.out.println(isEven(number));

    }

    public static boolean isEven(int number) {

    /*    if(number %2 == 0){
            return true;
        }

        return false;

    }*/
        return (number % 2 == 0);

    }
    }
