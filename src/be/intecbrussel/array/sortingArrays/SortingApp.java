package be.intecbrussel.array.sortingArrays;

import java.util.Arrays;
import java.util.Random;

public class SortingApp {
    public static void main(String[] args) {

        final int ITERATIONS = 10;
        final int ARRAY_LENGTH = 10;
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS; i++) {

            int[] numbers = new int[ARRAY_LENGTH];

            for (int j = 0; j < numbers.length; j++) {

                numbers[j] = random.nextInt();
            }

            System.out.println(Arrays.toString(numbers));
            SortingUtil.bubbelSort(numbers);
            System.out.println(Arrays.toString(numbers));
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\nExecution time bubble sort: " +
                (endTime - startTime) + "ms\n");

        //smallestValue sorting

        startTime = System.currentTimeMillis();

        for(int i=0; i<ITERATIONS; i++){
            int[]numbers = new int[ARRAY_LENGTH];

            for(int j=0; j< numbers.length; j++){
                numbers[j] = random.nextInt();

            }
            System.out.println(Arrays.toString(numbers));
           // SortingUtil.selectionSort(numbers);
            SortingUtil.insertionSort(numbers);
        }

        endTime = System.currentTimeMillis();
        System.out.println("\nExecution time Selection sort: " +
                (endTime-startTime) + "ms\n");
    }
}
