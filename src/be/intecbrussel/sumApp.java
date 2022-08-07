package be.intecbrussel;

public class sumApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

      String resultMsg = "Result: ";
        int result = a+b;
        System.out.println(resultMsg+result);

        result = sum(14, 25);
        System.out.println(resultMsg+result);

        float floatResult = sum(3.50F, 5.50F);
        System.out.println(resultMsg + floatResult);

        char charResult = sum('a', 'b', 'c');
        System.out.println(resultMsg +charResult);
    }

    public static int sum(int number1, int number2){
       return number1 + number2;

            }
    public static float sum(float number1, float number2){
        return number1 - number2;
    }

    public static char sum(char char1, char char2, char char3){
        return (char) (char1 + char2-char3);

    }
}
