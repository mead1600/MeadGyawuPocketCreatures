package Rooms;

import Rooms.Person;

public class Board {
    Person occupant;
    int xLoc,yLoc;
    //String type;

    public Board(int x, int y)//, //String type)
    {
        xLoc = x;
        yLoc = y;
        //this.type = type;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You entered an empty field.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

}