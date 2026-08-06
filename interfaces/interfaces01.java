public class interfaces01 {

    // Inner Interface
    interface Car {
        void drive();
    }

    // Inner Class implementing Car interface
    class Thar implements Car {

        @Override
        public void drive() {
            System.out.println("Thar is Driving");
        }
    }


    // Another Interface
    interface Animal {

        void sound(); // abstract method

    }


    // Class implementing Animal
    class Dog implements Animal {

        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }


    public static void main(String[] args) {


        // Car Interface
        interfaces01 obj = new interfaces01();

        Car c = obj.new Thar();
        c.drive();


        // Animal Interface
        Animal a = obj.new Dog();
        a.sound();

    }
}