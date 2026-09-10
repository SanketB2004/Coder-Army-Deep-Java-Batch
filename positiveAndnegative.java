import java.io.*;
public class positiveAndnegative {
    public static void main(String[] args) {
        
        String a = "hi";
        String b = "by";
        // output : hbiy;

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        char[] c = new char[arr1.length + arr2.length];
int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            
            for (int j = 0; j < arr2.length; j++) {
            
                if (i == j ) {
                 c[index] = arr1[i];
                    index++;

                    c[index] = arr2[j];
                    index++;
                }
        }
        }
         System.out.println(c);

    }
}
