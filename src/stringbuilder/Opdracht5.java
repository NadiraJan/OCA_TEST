package stringbuilder;

public class Opdracht5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dit is mijn eerste stringBuilder");
        StringBuilder sb2 = new StringBuilder("Dit is mijn tweede stringBuilder");

        System.out.println(sb);
        System.out.println(sb2);

        int offset = sb.indexOf("Dit");
        sb.insert(offset, "Helaas ");
        System.out.println(sb);

        sb2.reverse();
        System.out.println(sb2);

        for(int i=0; i< sb.length(); i++){
            if(sb.charAt(i) == ' '){     //spaties te verwijderen
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);

        for(int i=0; i<sb2.length(); i++){
            if(sb2.charAt(i) == 't'){
                sb2.insert(i++, 't'); //letter 't'  te verdubbelen
            }
        }

        System.out.println(sb2);
    }
}
