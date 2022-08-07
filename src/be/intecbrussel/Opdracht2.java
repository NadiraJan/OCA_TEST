package be.intecbrussel;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {

       Scanner kbd = new Scanner(System.in);
        Random rand = new Random();
        var numberToGuess = rand.nextInt(10);
        System.out.println("enter a number: ");
        var guessed = false;
        while (!guessed){
            var guess = kbd.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!");
            }
            else {
                if(guess>numberToGuess){
                    System.out.println("lower!");
                }
                else{
                    System.out.println("guessed");
                    guessed =true;
                }
            }
        }
        kbd.close();

    }

}
