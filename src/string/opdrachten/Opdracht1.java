package string.opdrachten;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {

      Scanner kbd = new Scanner(System.in);
      String text;

        System.out.println("Enter a sentence: ");
        text = kbd.nextLine();

        System.out.println(text +"\nhas " + text.length() + "chars.");

        System.out.println(text.toUpperCase());// . ROOT GEBRUIKT VOOR ENCODING VAN CHARACTERS
        System.out.println(text.toLowerCase());

        System.out.println(text.replace('a', 'o'));

        char searchValue = 'e';
        int count = 0;

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == searchValue){
                count++;
            }
        }
        System.out.println("The search value has been found: " + count + " times");

        String world = "Hello World";
        String mars = "Hello Mars";
        System.out.println(world.equals(mars)); //false

        if(world.compareTo(mars) < 0) { //geeft int waarde terug geen boolean
            System.out.println(world);
            System.out.println(mars);
        } else {
            System.out.println(mars); //alfabetisch eerst Hello Mars is
            System.out.println(world);

        }
        String spaces = "                    Text with Whitespaces           ";
        System.out.println(spaces.trim());

        kbd.close();

    }
}
