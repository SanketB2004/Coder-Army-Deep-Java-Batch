package Strings;

public class string02 {
    public static void main(String[] args) {

        String s1 = "San" + "ket";
        String s2 = "Sanket";
        // System.out.println(s1==s2); // true karan used string literal

        String s3 = "Sanket";
        String s4 = s3 + "Bhosale";// runtime s3 is go to heap memory in Sanket imagine
        String s5 = "Sanket Bhosale";
        // System.out.println(s4 == s5); // false

        String s6 = "Sanket";
        String s7 = s6;
       // System.out.println(s6==s7);

       String s8 = "Sanket";// grabage collection run and Sanket Clean
       s8 = "World";
       System.out.println(s8);
    }
}
