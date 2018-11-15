package Rooms;

import Creatures.Typing;
import Rooms.Person;
public class House extends Board{
    public House(int x, int y)//, String type)
    {
        super(x, y);//type);
    }
    public void enterRoom(Person x, Typing version,int CreatureBoxes, double chance)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You entered the house of a nice married couple. They gave you some food and sent you on your merry way.");
    }

}
