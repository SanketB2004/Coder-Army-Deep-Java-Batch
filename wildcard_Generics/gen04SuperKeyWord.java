package wildcard_Generics;
import java.util.ArrayList;
// lower bount means super keyword
import java.util.List;

public class gen04SuperKeyWord {
    public static void main(String[] args) {
        List<Animal> aniaml = new ArrayList<>();

        aniaml.add(new Animal());
        aniaml.add(new Animal());
fun(aniaml);
        
    }
    static void fun(List<? super Animal> values) {
      // writing allowed
        values.add(new Animal());
        values.add(new lab());


        // reading not allowd simple alloowed object 

        for (Object obj : values) {
            Animal animal = (Animal) obj;

            animal.eat();
             if (obj instanceof lab) {
        lab l = (lab) obj;
        l.barkk();
    }
            
      
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

class lab extends dog {
    void barkk() {
        System.out.println("Labrador Is Barking");
    }
}
