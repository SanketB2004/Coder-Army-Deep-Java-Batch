interface Animal {

    void eat();

}


// Interface inheritance
interface Dog extends Animal {

    void bark();

}


// Class implements child interface
class Labrador implements Dog {


    @Override
    public void eat() {

        System.out.println("Dog is eating");

    }


    @Override
    public void bark() {

        System.out.println("Dog is barking");

    }

}


public class interfacee04 {

    public static void main(String[] args) {


        Labrador l = new Labrador();

        l.eat();
        l.bark();

    }
}