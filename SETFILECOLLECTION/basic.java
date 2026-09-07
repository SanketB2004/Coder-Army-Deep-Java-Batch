import java.util.*;

public class basic {

    public static void main(String[] args) {

        // HashSet
        Set<Integer> hashSet = new HashSet<>();

        Set<Integer> hashSet1 = new HashSet<>(10, 0.8f);
        // Initial Capacity + Load Factor

        Set<Integer> hashSet2 =
                new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));


        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Set<Integer> linkedHashSet1 =
                new LinkedHashSet<>(10, 0.8f);
        // Initial Capacity + Load Factor

        Set<Integer> linkedHashSet2 =
                new LinkedHashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));


        System.out.println("HashSet : " + hashSet2);
        System.out.println("LinkedHashSet : " + linkedHashSet2);
    }
}