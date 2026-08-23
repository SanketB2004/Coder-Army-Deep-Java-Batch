package wildcard_Generics;

import java.util.*;

/**
 * gen01
 */
public class gen01 {

    public static void main(String[] args) {
        // inveriant in8 generics
        // Animal animal = new dog();

        // animal.eat();
        // animal.walk();

        // List<dog> dogs = new ArrayList<>();

        // List<Animal> animals = dogs;

    //     dog[] dogs = new dog[10];
    //     Animal[] animals = dogs; /// risky conversion
    // animals[0] = new Animal();
    // for (Animal animal : animals) {
    //     animal.eat();
    // }   // Error

    
        
    }
}

class Animal{
void eat(){
System.out.println("Eating");
}
void walk(){
System.out.println("Walking");
}

}

class dog extends Animal{
void bark(){
    System.out.println("Barking");
}

}