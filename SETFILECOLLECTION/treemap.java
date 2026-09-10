import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        
        TreeMap<Integer , String> map = new TreeMap<>();

        map.put(101, "Sanket");
   map.put(102, "Kaka");
   map.put(103, "Aai");
   map.put(104, "Atharv");
   map.put(105, "Bhosale"); 

//    System.out.println(map.firstEntry());

// System.out.println(map.headMap(106));
//System.out.println(map.subMap(101, 102)); all in middele values print this used to 


// sorted map
System.out.println(map.lowerEntry(102));// lower value get in 102 

// cililEntry() // floorEntry() // higherEntry()

// pollFirstEntry() // polllastEntry()

// map.headdmap()
// map.tailmap()



    }
}
