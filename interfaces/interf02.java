public class interf02 {
    
 public static void main(String[] args) {

        // Direct access using interface name

        System.out.println(Interface02.PRICE);
        System.out.println(Interface02.BRAND);
        System.out.println(Interface02.MODEL);

    }

    interface Interface02 {

    // Interface variables
    int PRICE = 500;
    String BRAND = "Toyota";
    String MODEL = "Fortuner";

}
}
