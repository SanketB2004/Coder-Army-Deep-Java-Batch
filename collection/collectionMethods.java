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

// size method 
int n = c.size();
System.out.println(n);
// is empty method 
System.out.println(c.isEmpty());


}
    
}