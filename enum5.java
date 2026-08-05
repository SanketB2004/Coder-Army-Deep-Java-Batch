public class enum5 {
    public static void main(String[] args) {
        Direction[] direction = Direction.values(); // give array
        // for (Direction direction2 : direction) { // use name() to print a arr elemtn nytr hash code print hoil

        //     System.out.println(direction2.name());
        // }

         Direction d = Direction.valueOf("EAST");
        //System.out.println(d); // he convert karat string la enum madhe 
        // samj me yethe string dili ahe tr yala enum madhe asel tr error ny nytr exception yeyil 
System.out.println(d.ordinal());
    }

    enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST;

         @Override
    public String toString() {
        return "Direction";
    }
    }
}
