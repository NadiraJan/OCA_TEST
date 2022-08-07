package methodOpdrachten;

import java.util.Scanner;

public class Palyndrom {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = kbd.nextInt();

        if(palyndrom(number)){
            System.out.println("Your number is a palindrom");
        }
        else
        {
            System.out.println("Your number is not a palindrom");
        }
        kbd.close();

    }

    public static boolean palyndrom(int n) {
        int temp = n;
        int remainder;
        int reverse = 0;

        while(temp>0){
            remainder = temp % 10;
            temp/= 10;
            reverse =(reverse * 10) +remainder;
        }
        return reverse == n; //zal boolean teruggeven

    }
}