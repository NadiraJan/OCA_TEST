package be.intecbrussel.array.sortingArrays;

public class SortingUtil {

    public static void bubbelSort(int [] numbers){

        //bubbelSortMethode linkse en rechtse values vergelijken

        for(int i=0; i< numbers.length; i++){

            for(int j=0; j<(numbers.length -1)-i; j++){

                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }

    //opzoeken kleinste element
    public static void selectionSort(int[]numbers){

        for(int i = 0; i< numbers.length; i++){

            int smallestValue = i;

            for(int j=i+1; j< numbers.length; j++){
                if(numbers[j] < numbers[smallestValue]){
                    smallestValue = j;
                }
            }
            int temp = numbers[smallestValue];
            numbers[smallestValue] = numbers[i];
            numbers[i] = temp;
        }

    }

    public static void insertionSort(int[] numbers){

        //elke item vergelijken met linker kant van array

        for(int i =1; i < numbers.length; i++){

            int key = numbers[i];
            int j = i;
            while(j>0 && numbers[j-1]>key) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = key;
        }

    }
}
