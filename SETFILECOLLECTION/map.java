import java.util.*;
public class map {
    public static void main(String[] args) {
   Map<Integer , String> map = new HashMap<>();
   
   map.put(101, "Sanket");
   map.put(102, "Kaka");
   map.put(103, "Aai");
   map.put(104, "Atharv");
   map.put(105, "Bhosale");
        
map.size();
map.isEmpty();

System.out.println(map.containsValue("Sanket"));// check value exits
System.out.println(map.containsKey(101)); // check a key are exits



    }
}
