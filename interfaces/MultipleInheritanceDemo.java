
    interface A {

    void showA();

}


interface B {

    void showB();

}


// Multiple inheritance using interfaces
class C implements A, B {


    @Override
    public void showA() {

        System.out.println("Method of Interface A");

    }


    @Override
    public void showB() {

        System.out.println("Method of Interface B");

    }

}


public class MultipleInheritanceDemo {

    public static void main(String[] args) {


        C obj = new C();

        obj.showA();
        obj.showB();

    }
}

