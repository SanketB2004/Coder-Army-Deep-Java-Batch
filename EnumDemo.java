enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

public class EnumDemo {
    public static void main(String[] args) {

        // 1. values() -> सर्व enum values array मध्ये देतो
        Direction[] arr = Direction.values();

        System.out.println("----- values() -----");
        for (Direction d : arr) {
            System.out.println(d);
        }

        // 2. name() -> Enum चे नाव String मध्ये देतो
        System.out.println("\n----- name() -----");
        System.out.println(Direction.NORTH.name());

        // 3. ordinal() -> Position (Index) देतो (0 पासून)
        System.out.println("\n----- ordinal() -----");
        System.out.println(Direction.NORTH.ordinal()); // 0
        System.out.println(Direction.SOUTH.ordinal()); // 1
        System.out.println(Direction.EAST.ordinal());  // 2
        System.out.println(Direction.WEST.ordinal());  // 3

        // 4. valueOf() -> String ला Enum मध्ये convert करतो
        System.out.println("\n----- valueOf() -----");
        Direction d = Direction.valueOf("EAST");
        System.out.println(d);

        // 5. toString() -> Default ला name() सारखेच print होते
        System.out.println("\n----- toString() -----");
        System.out.println(Direction.WEST.toString());
    }
}