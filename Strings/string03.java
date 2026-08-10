package Strings;

public class string03 {
    
    public static void main(String[] args) {
        
//   String s1 = new String();
//   String s2 = new String("Heloo");
// //   System.out.println(s2); 

//   String s3 = "Sanket";

//   String s4 = new String(s3);
  char[] arr = {'S','A','N','K','E','T'};
  String s6 = new String(arr,0,2);
System.out.println(s6); // this 0 is index and count is 2 index tak print kara words 

// check this a unicode ascaii values print 

byte[] arr2 =  {97,98,99};
String s7 = new String(arr2);
System.out.println(s7); // output is a (abc)



// StringBuilder / Stringbuffer

StringBuilder sb = new StringBuilder("Hello");
String s8 = new String(sb);
System.out.println(s8);
 
    }
}
