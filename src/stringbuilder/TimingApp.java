package stringbuilder;

public class TimingApp {
    public static void main(String[] args) {

        String s1 = "";
        long startTime = System.nanoTime();//in nanoseconden

        for(int i= 0; i<100_000; i++){
            s1+=i;
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time String concatenation: "+
                (endTime - startTime)/1_000_000 +"ms");

        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0; i<100_000; i++){
            sb.append(i);
        }
         endTime = System.nanoTime();
        System.out.println("Execution time StringBuilder concatenation: " +
                (endTime-startTime)/1_000_000 +"ms");
    }
}
