package Rooms;

import Creatures.Typing;
import Rooms.Person;
import Game.Runner;

public class Forest extends Board{
    Typing type;
    public Forest(int x, int y)
    {
        super(x, y);//, type);
    }
    public void enterRoom(Person x, Typing version) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Windo, the air type creature");
            version = new Typing("air");
            //String realVer = toString(version);
            System.out.println("Type: " + version);
            //setAir(type);
            //this.type = "air";
        } else {
            System.out.println("You ran into WaterLilly, the water type monster");
            version = new Typing("water");
            //String realVer = toString(version);
            System.out.println("Type: " + version);
            //setWater(type);
            //this.type = "water";
        }
    }
    /*public String toString(Typing version)
    {
        String type = "";
        type = "" + version + "";
        return type;
    }*/
}
