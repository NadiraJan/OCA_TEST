package objectOrientedProgramming;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1==s2);
        System.out.println(s1 == s3);//false omdat verschillende objecten en geen ingoud vergeleken worden

        System.out.println(s1.equals(s3));//true door gebruik van Equals

        String concatenatedStringString = s1.concat(s2);
        System.out.println("String1 + String2 " + concatenatedStringString);
    }
}
