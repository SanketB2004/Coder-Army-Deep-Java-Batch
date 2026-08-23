package wildcard_Generics;

import java.util.*;

public class gen02 {
    public static void main(String[] args) {
        List<dog> dogs = new ArrayList<>();

        dogs.add(new dog());
        dogs.add(new dog());

        fun(dogs);
        // List<Animal> animals = new ArrayList<>();

        // animals.add(new Animal());
        // animals.add(new Animal());

        // fun(animals);

    }

    // static void fun(List<Animal> animals) {
    //     for (Animal animal : animals) {
    //         animal.eat();
    //     }
    // }

    
    static void fun(List<?> values) {
        for (Object obj : values) {
            System.out.println(obj.getClass().getName());
    } // this used to only values read not add values ex values.add
    // Object obj = values.get(0); he karu shakato pn te nay 

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