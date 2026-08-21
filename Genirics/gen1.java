package Genirics;

public class gen1 {
    
    public static void main(String[] args) {
        
        // upcasting 
        String s = "Hello";
        Object obj = s ;

        System.out.println(obj);

        // downcasting 

        Object obj2 = "Sanket";
        String s2 = (String) obj2;

        System.out.println(s2);

         Object obj3 = 100;
        String s3 = (String) obj3;

        System.out.println(s3);
    }
}
