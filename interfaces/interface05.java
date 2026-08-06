 public class interface05 {


    interface Vehicle {

        // abstract method
        void start();


        // default method
        default void stop() {

            System.out.println("Vehicle stopped");

        }
    }


    class Car implements Vehicle {


        @Override
        public void start() {

            System.out.println("Car started");

        }

    }


    public static void main(String[] args) {


        interface05 obj = new interface05();

        Vehicle v = obj.new Car();

        v.start();

        // default method call
        v.stop();

    }
}