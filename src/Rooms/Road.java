package Rooms;

import Creatures.Typing;
import java.util.Scanner;
import Rooms.Person;
import Creatures.Fire;
import Creatures.Earth;

public class Road extends Board{
    public Road(int x, int y)
    {
        super(x, y);//, type);
    }
    public void enterRoom(Person x, Typing version, int CreatureBoxes, double chance) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        double type = Math.random();
        if (type < 0.5) {
            System.out.println("You an into another Flameo, the fire type creature");
            version = new Typing("fire");
            System.out.println("Whould you like to catch this flameo?(y/n)");
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
                //double chance = Math.random();
                new Fire(chance);//CreatureBoxes);
            }
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
            System.out.println("Whould you like to catch this groundy?(y/n)");
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
                //double chance = Math.random();
                new Earth(chance);//CreatureBoxes);
            }
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
