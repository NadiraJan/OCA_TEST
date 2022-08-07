package be.intecbrussel.arrays2;

public class App {
    public static void main(String[] args) {
        System.out.println(average(4,7,9));
        System.out.println(average(4));
        System.out.println(average(5,45,8,8));

    }
    public static int average(int ... values){  //...  voor aantal parameters
        int total = 0;
        for(int el: values){
            total+=el;
        }
        int average  = 0;
        if(values.length !=0){
            average = total/values.length;
        }
        return average;

    }
}
