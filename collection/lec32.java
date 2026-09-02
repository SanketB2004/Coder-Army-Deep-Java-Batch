package collection;

import java.util.*;

public class lec32 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);


        // 2. add(index, element)
        list.add(2, 100);

        System.out.println("After add(index, element): " + list);


        // 3. get(index)
        System.out.println("get(1): " + list.get(1));


        // 4. set(index, element)
        list.set(1, 200);

        System.out.println("After set(): " + list);


        // 5. remove(index)
        list.remove(2);

        System.out.println("After remove(index): " + list);


        // 6. remove(object)
        list.remove(Integer.valueOf(50));

        System.out.println("After remove(object): " + list);


        // 7. contains()
        System.out.println("Contains 30: " + list.contains(30));


        // 8. indexOf()
        System.out.println("Index of 30: " + list.indexOf(30));


        // 9. lastIndexOf()
        list.add(30);

        System.out.println("Last index of 30: " + list.lastIndexOf(30));


        // 10. size()
        System.out.println("Size: " + list.size());


        // 11. isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());


        // 12. toString()
        System.out.println("toString(): " + list.toString());


        // 13. iterator()
        System.out.println("Using Iterator:");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // 14. forEach()
        System.out.println("Using forEach:");

        for (Integer value : list) {
            System.out.println(value);
        }


        // 15. sort()
        list.sort(null);

        System.out.println("After sort(): " + list);


        // 16. copyOf()
        List<Integer> copyList = List.copyOf(list);

        System.out.println("Copied List: " + copyList);


        // 17. clear()
        list.clear();

        System.out.println("After clear(): " + list);


        // 18. isEmpty() after clear
        System.out.println("Is Empty: " + list.isEmpty());
    }
}