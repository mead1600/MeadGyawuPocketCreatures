package Rooms;

import Rooms.Person;
public class Road extends Board{
    public Road(int x, int y)
    {
        super(x, y);
    }
    public void roadSpot(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another flameo, the fire type creature");
        } else {
            System.out.println("You ran into Groundy, the earth type monster");
        }
    }
}
