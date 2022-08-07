package stringbuilder;

public class App {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello world");

      /*  int offset = sb.indexOf("World");
        sb.insert(offset, "Big ");*/
        System.out.println(sb);

        StringBuilder sentence = new StringBuilder();
        sentence.append("This ")
                .append("is ")
                .append("method ")
                .append("chaining!");
        System.out.println(sentence);

        StringBuilder copy = sentence;
        System.out.println(copy);

        for(int i=0; i<sentence.length();i++){
            char upperCaseChar =Character.toUpperCase(sentence.charAt(i)) ;
            copy.setCharAt(i, upperCaseChar);
        }
        System.out.println("All upercase: " + sentence);


        //String class we converted to String class and use string method
        String toLowerCase = sentence.toString().toLowerCase();
        sentence = new StringBuilder(toLowerCase);
        System.out.println("All lowerCase: " +sentence);

        sentence.reverse();
        System.out.println("Reversed internal value " + sentence);
//result: Reversed internal value !gniniahc dohtem si siht

        final int CHAR_COUNT = sentence.length();

        for(int i = 0; i<CHAR_COUNT; i++){
            copy.deleteCharAt(0);
        }
        System.out.println(copy);

        String firstName = "Alexander ";
        String lastName = "Keisse";

        String fullName = firstName + lastName;
        System.out.println("String concatenation: " + fullName);

        fullName = null;
        fullName = new StringBuilder().append(firstName).append(lastName).toString();
        System.out.println("Same result using StringBuilder " + fullName);
    }
}
