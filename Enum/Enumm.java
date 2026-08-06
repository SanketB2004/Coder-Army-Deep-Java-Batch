package Enum;
public class Enumm {

    // 1. Enum
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    // 2. Enum with Constructor & Method
    enum Laptop {

        HP(50000),
        DELL(60000),
        ASUS(70000);

        int price;

        Laptop(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {

        // Basic Enum
        Day d = Day.MONDAY;
        System.out.println("Day : " + d);

        // Compare Enum
        if (d == Day.MONDAY) {
            System.out.println("Today is Monday");
        }

        // values()
        System.out.println("\nAll Days :");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // ordinal()
        System.out.println("\nOrdinal of MONDAY : " + Day.MONDAY.ordinal());
        System.out.println("Ordinal of FRIDAY : " + Day.FRIDAY.ordinal());

        // valueOf()
        Day day1 = Day.valueOf("SUNDAY");
        System.out.println("\nvalueOf() : " + day1);

        // switch
        System.out.println("\nSwitch Example :");

        switch (day1) {

            case MONDAY:
                System.out.println("Office");
                break;

            case TUESDAY:
                System.out.println("Office");
                break;

            case WEDNESDAY:
                System.out.println("Office");
                break;

            case THURSDAY:
                System.out.println("Office");
                break;

            case FRIDAY:
                System.out.println("Office");
                break;

            case SATURDAY:
                System.out.println("Half Day");
                break;

            case SUNDAY:
                System.out.println("Holiday");
                break;
        }

        // Constructor
        System.out.println("\nLaptop Price :");
        System.out.println("HP : " + Laptop.HP.price);

        // Method
        System.out.println("DELL : " + Laptop.DELL.getPrice());

        // Loop through Laptop Enum
        System.out.println("\nAll Laptop Details :");

        for (Laptop l : Laptop.values()) {
            System.out.println(l + " -> " + l.getPrice());
        }
    }
}