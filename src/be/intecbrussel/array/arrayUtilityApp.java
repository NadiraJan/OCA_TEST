package be.intecbrussel.array;

import java.util.Arrays;

public class arrayUtilityApp {
    public static void main(String[] args) {

        int [] numbers = {10,20,15,22,35};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("sorted numbers: " + Arrays.toString(numbers));

        int key = 22;
        System.out.println(key + " found at index: " + Arrays.binarySearch(numbers,key));

        int[] biggerArray = Arrays.copyOf(numbers, 25);
        System.out.println(Arrays.toString(biggerArray));

        int[] testScores = new int[25];
        Arrays.fill(testScores, 10);
        System.out.println("All test scores: " +Arrays.toString(testScores));
    }
}
