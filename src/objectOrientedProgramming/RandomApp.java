package objectOrientedProgramming;

import java.util.*;

public class RandomApp {
    public static void main(String[] args) {

      /*  Random rand = new Random();
        System.out.println(rand.nextInt());*/

        Random rand = new Random();
        for(int i=0; i<6; i++){
            System.out.println(rand.nextInt(46));
        }
    }
}
