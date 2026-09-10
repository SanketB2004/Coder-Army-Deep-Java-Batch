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

//System.out.println(map.containsValue("Sanket"));// check value exits
//System.out.println(map.containsKey(101)); // check a key are exits

//System.out.println(map.get(101));// element get this all map

// // update 
 //System.out.println(map.put(106 , "Raje"));
// sout madhe ahe lagicha update ny hot to retur null denar check in terminal 
// remove 
// map.remove(105);
//System.out.println(map.get(106));

// map.putAll() bug values put in map 

// map.ketset // all key ghenyasathi use hott 

// map.values // all values string collection return becuse values dublicate hou shakatat 

// map.entrySet() // set of type entry return 
// Set<Map.Entry<Integer , String>> entry = map.entrySet();
// System.out.println(entry);

// set and defult //map.getOrDefult 

// map.puIfAbsent // mhanje jr 104 aleredy exits ahe tr ha ny karat exists 

// map.remove (key , value) jr me jevha remove karel key and value same ahet manje ki 104 he valu ahe taracha remove nytr ny

// map.replace (104 , "Sanket") only update 

// map.replace(104 , sanket , SANKET) mhanje ki key 104 madhe jr sanket asel taracha me update karun SANKET takanar

 Set<Map.Entry<Integer , String>> entries = map.entrySet();


// for (Map.Entry<Integer,String> entry : entries) {
//     Integer key = entry.getKey();
//     String value = entry.getValue();

//     System.out.println(key + " , "+value);
// }

Map<Integer , String> map8 = Map.of(101,"sanket" , 102 , "kaka", 103 , "aai" , 104 , "Bala");





    }
}
