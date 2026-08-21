// package Genirics;

// public class gen2 {
//     public static void main(String[] args) {
// //Box b1 = new Box(10); // asa karata ny ala pahije pn java internally yala object type samjat ahe tyamule ok

// // integer sathi usefull
// Box<Integer> b1 = new Box<Integer>(10);// type argument // this used to generics any data types used here  

// System.out.println(b1.getvalue()+5);

// // string sathi usefull
// Box<String> b2 = new Box<String>("Sanket");
// System.out.println(b2.getvalue());




//     }

// }
// // Generics


// class Box <T>{ // type parameter 
//     private T value; // T is only place holder not this data types i dont this type but this type select create a object time this seleect type 
// //  this is class not set data type this class any used datatype only create a object and set type and used this class

//     Box(T value) {
//         this.value = value;
//     }

//     public T getvalue() {
//         return this.value;
//     }

//     public void setValue(T value) {
//         this.value = value;
//     }

// }







// Multi Level Used In One generics Object Data Type 

package Genirics;

public class gen2 {

    public static void main(String[] args) {

        // Without Generics
        // Box b1 = new Box(10);
        // Raw type वापरल्यामुळे Java Object type प्रमाणे treat करते.

        // Integer साठी
        Box<Integer> b1 = new Box<Integer>(10);
        // Integer हा Type Argument आहे.

        System.out.println(b1.getValue() + 5);


        // String साठी
        Box<String> b2 = new Box<String>("Sanket");

        System.out.println(b2.getValue());


        // दोन different data types
        BoxTwo<Integer, String> b3 = new BoxTwo<>(10, "Hi");

        System.out.println(b3.getValue());
        System.out.println(b3.getValu());
    }
}


// Generic Class
class Box<T> {

    private T value;

    // T = Type Parameter
    // T हा फक्त placeholder आहे.
    // Object create करताना कोणता data type हवा
    // तो आपण specify करतो.

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


// Generic Class with two Type Parameters
class BoxTwo<A, B> {

    private A value;
    private B valu;

    // Constructor
    BoxTwo(A value, B valu) {
        this.value = value;
        this.valu = valu;
    }

    // Getter for A
    public A getValue() {
        return this.value;
    }

    // Getter for B
    public B getValu() {
        return this.valu;
    }

    // Setter for A
    public void setValue(A value) {
        this.value = value;
    }

    // Setter for B
    public void setValu(B valu) {
        this.valu = valu;
    }
}