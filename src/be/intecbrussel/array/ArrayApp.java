package be.intecbrussel.array;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        int [] numbers = new int[20];//lege array van 20 getalen

        for(int i= 0, j=1; i< numbers.length; i++){
            numbers[i] = j++ * 7;
        }
        System.out.println(numbers); //result: [I@e9e54c2
        System.out.println(Arrays.toString(numbers));
        //Result: [7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140]


    }
}
