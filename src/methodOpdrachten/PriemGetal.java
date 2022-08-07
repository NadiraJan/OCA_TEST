package methodOpdrachten;

public class PriemGetal {
    public static void main(String[] args) {

        for (int getal = 2; getal < 500; getal++) { //prime getal start vanaf 2

            if (primeNumber(getal)) {
                System.out.println(getal + "is a primeNumber");
            }
        }
    }
    public static boolean primeNumber(int number) {

        for (int i = 2; i < number; i++) { //kijken of number is deelbaar door zichzelf
            if (number % i == 0) {  //kijken of number is deelbaar is door ander getal
                return false;

            }
        }
        return true;
    }
    }





