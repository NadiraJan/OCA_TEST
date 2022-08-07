package stringformatter;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Formatter;

public class App {
    public static void main(String[] args) {

        //Formatter class om onze programma's op elegante manier te maken

        Formatter formatter = new Formatter();
        String text = "I'm %d years old!";
        formatter.format(text, 32);

        System.out.println(formatter);
        //RESULT: I'm 32 years old!
        // "%d" is vervangen door 32

    //   text = "I'm %d years old and I'm %f m tall ";
    //    formatter.format(text, 32, 1.87);
     //   System.out.println(formatter);
        //RESULT: I'm 32 years old!I'm 32 years old and I'm 1.870000 m tall
        //%d en %f (float number) vervangen

        //we zien na de comma 6 cijfers, om die mooier te maken we add %.2f - 2 is hoeveel
        //cijfers willen we na de comma zien:
        text = "I'm %d years old and I'm %.2f m tall ";
        formatter.format(text, 32, 1.87);
        System.out.println(formatter);
//RESULT: I'm 32 years old and I'm 1.87 m tall

        formatter.close();
        System.out.printf("I'm %d years old and I'm %.2f m tall ", 32, 1.87);
        //printFormat methode
    }
}
