package Rooms;

import Creatures.Air;
import Creatures.Fire;
import Creatures.Typing;
import Rooms.Person;
import Game.Runner;
import Creatures.Air;
import Creatures.Water;
import java.util.Scanner;

public class Forest extends Board{
    Typing type;
    public Forest(int x, int y)
    {
        super(x, y);//, type);
    }
    public void enterRoom(Person x, Typing version, int CreatureBoxes) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Windo, the air type creature");
            version = new Typing("air");
            //String realVer = toString(version);
            System.out.println("Type: " + version);
            System.out.println("Whould you like to catch this Windo?(y/n)");
            Scanner decision = new Scanner(System.in);
            String Final = decision.nextLine();
            while(!(Final.toLowerCase().equals("y")) && !(Final.toLowerCase().equals("n")))
            {
                System.out.println("Please answer with y or n");
                decision = new Scanner(System.in);
                Final = decision.nextLine();
            }
            if(Final.toLowerCase().equals("y"))
            {
                new Air(CreatureBoxes);
            }
            //setAir(type);
            //this.type = "air";
        } else {
            System.out.println("You ran into WaterLilly, the water type monster");
            version = new Typing("water");
            //String realVer = toString(version);
            System.out.println("Type: " + version);
            System.out.println("Whould you like to catch this WaterLilly?(y/n)");
            Scanner decision = new Scanner(System.in);
            String Final = decision.nextLine();
            while(!(Final.toLowerCase().equals("y")) && !(Final.toLowerCase().equals("n")))
            {
                System.out.println("Please answer with y or n");
                decision = new Scanner(System.in);
                Final = decision.nextLine();
            }
            if(Final.toLowerCase().equals("y"))
            {
                new Water(CreatureBoxes);
            }
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
