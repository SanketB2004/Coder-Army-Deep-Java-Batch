package Enum;
public class enum3 {
    public static void main(String[] args) {
        
        Direction d = Direction.EAST;
d.move();
    }

    enum Direction {
        // thats is a abstract method overide 
        // enum class madhe konati pn method 
        // override karayachi asel tr tyala
        // anonyms class sarkha use karave lagate 
        //but main class madhe ny tr enum class madhe use 
        // ok check on your nootebook
        // enum madhecha method ani enum madhecha 
        // anonyms class this is enum class .
        NORTH{
            @Override
            public void move(){
System.out.println("This Direction is North Side ");
            }
        },
        SOUTH{
            @Override
            public void move(){
                System.out.println("This Direction is South Side ");
            }
        },
        EAST{
            @Override
            public void move(){
                System.out.println("This Direction is East Side ");
            }
        },
        WEST{
            @Override
            public void move(){
                System.out.println("This Direction is West Side ");
            }
        };
       

       public abstract void move();
        
    }
}
