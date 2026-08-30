package collection;
// this only check a iterable class check
import java.util.*;
public class iterable {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);

       Iterator<Integer> it =  list.iterator();

       while (it.hasNext()) {
        System.out.print(it.next()+" ");
       } // this loop print list of collcetion
        
    }
}
