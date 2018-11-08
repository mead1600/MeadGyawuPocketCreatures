package Rooms;

import Rooms.Person;
public class Forest extends Board{
    public Forest(int x, int y)
    {
        super(x, y);
    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Windo, the air type creature");
        } else {
            System.out.println("You ran into WaterLilly, the water type monster");
        }
    }
}
