package wildcard_Generics;

import java.util.ArrayList;
import java.util.List;
// wildcards with upperbounds
public class gen03Bounds {
    public static void main(String[] args) {
         List<dog> dogs = new ArrayList<>();

        dogs.add(new dog());
        dogs.add(new dog());
fun(dogs);
    }
    static void fun(List<? extends Animal> values) {
       for (Animal animal : values) {
        animal.eat();
        // not writing allowed here
       }
    } 
}

class Animal {
    void eat() {
        System.out.println("Eating");
    }

    void walk() {
        System.out.println("Walking");
    }

}

class dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
