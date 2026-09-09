import java.util.*;

public class treesetused {
public static void main(String[] args) {
// Tree Set Using // self balnsing tree
TreeSet<Integer> set = new TreeSet<>();

//  Set<Integer> set2 = new TreeSet<>(List.of(1,2,3,4));

set.add(80);
set.add(23);
set.add(10);
set.add(90);
set.add(50);
// sortedset interface --> o(log n)
// sorted set interface cya all methods used in tree set 
// System.out.println(set.first());
// System.out.println(set.last());
// System.out.println(set.headSet(80));// this give me a all 80 less element list
// System.out.println(set.tailSet(80));// 80 greter element gives me 
// System.out.println(set.subSet(10,80));// all gives me element in array 10 to 80 middel numbers gives me 

// Navigable Set Properties gives me in TreeSet used in

System.out.println(set.lower(80));// manje mala ha asa elament denar ki 80 peksha small but in array this big element 
System.out.println(set.floor(80));// gretest element less than 80

System.out.println(set.higher(80));// smallest element greter than 80
System.out.println(set.ceiling(80));// smallest no greter than or equal to 80

// System.out.println(set.pollFirst());// ha number deto pn ani delet pn karato treeset madhun
// System.out.println(set.pollLast());// ha number deto pn ani delet pn karato treeset madhun

// System.out.println(set.first()); // check kela element delet kela ka ny yane 
// System.out.println(set.last()); // check kela element delet kela ka ny yane 

System.out.println(set.descendingSet());//




     
    }
}
