package methodOpdrachten;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your digit1: ");
        int digit1 = kbd.nextInt();


        System.out.println(som(digit1));
        kbd.close();

        //RESULT: enter your digit1:
        //25
        //7
    }

    public static int som(int number){
        int result = 0;

       while(number > 0){
          result += number % 10;   //sum of een int number
      //     result = result + number % 10 ; razvernutyi variant
           number/=10;

       }
        return result;
    }
}
