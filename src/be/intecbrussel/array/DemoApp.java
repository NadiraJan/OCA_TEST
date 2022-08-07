package be.intecbrussel.array;

import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {

        int [] numbers = new int[5]; // array van 5 elements;
        numbers[0] = 14;
        numbers[1] = 4;
        numbers[2] = 1;
        numbers[3] = 5; //array is ingevuld
        numbers[4] = 55;

        System.out.println(Arrays.toString(numbers));


        //2de manier om array te initialiseren:
      int[]numbers1;
        numbers1 = new int[]{3,5,2,5};
        System.out.println(Arrays.toString(numbers1));

       //3de manier
        int [] numbers2 = {12, 35, 35,22,15};
        System.out.println(Arrays.toString(numbers2));    }
}
