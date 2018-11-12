package Rooms;

import Creatures.Typing;
import Rooms.Person;

public class Road extends Board{
    public Road(int x, int y)
    {
        super(x, y);//, type);
    }
    public void enterRoom(Person x, Typing version) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Flameo, the fire type creature");
            version = new Typing("fire");
            //String realVer = toString(version);
            //System.out.println("Type: " + realVer);
            //String realVer = ""+version+"";

            System.out.println("Type: " + version);
            //this.type = "fire";
        } else {
            System.out.println("You ran into Groundy, the earth type monster");
            version = new Typing("earth");
            //String realVer = ""+version+"";
            //String realVer = toString(version);
            System.out.println("Type: " + version);
            //this.type = "earth";
        }
    }
    /*public String toString(Typing version)
    {
        String type = "";
        type = "" + version + "";
        return type;
    }*/
}
