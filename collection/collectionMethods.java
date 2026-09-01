package collection;
// This Class Used A Only Collection Methods
/**
 * collectionMethods
 */
import java.util.*;

public class collectionMethods {
public static void main(String[] args) {
    
    Collection<Integer> c = new ArrayList<>();
c.add(1);// Add Method
c.add(2);// Add Method
c.add(3);// Add Method

// // size method 
// int n = c.size();
// System.out.println(n);
// // is empty method 
// System.out.println(c.isEmpty());

// // boolean contains(Object o)
//System.out.println(c.contains(3)); // check this is in a array this number

//  Object[] toArray method

 //Object[] obj = c.toArray();
// for (Object o : obj) {
//     System.out.println(o);
// } 
// this is only objject array and you convert this array to typecast to
// all array methods is you passed this arry

// T[] toArray(); 

// Integer [] arr = c.toArray(new Integer[0]);

// for (Integer integer : arr) {
//     System.out.println(integer);
// }


// boolean add( E e)
boolean b = c.add(4);
System.out.println(b);

// boolean remove (Object obj);

 System.out.println(c.remove(2));

}
    
}