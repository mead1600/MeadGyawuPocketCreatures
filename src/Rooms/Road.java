package Rooms;

import Rooms.Person;
public class Road extends Board{
    public Road(int x, int y, String type)
    {
        super(x, y, type);
    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Flameo, the fire type creature");
            this.type = "fire";
        } else {
            System.out.println("You ran into Groundy, the earth type monster");
            this.type = "earth";
        }
    }
}
