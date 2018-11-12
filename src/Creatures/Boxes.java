package Creatures;

import Game.Runner;

public class Boxes {
    int container;
    public Boxes(int container)
    {
        this.container = container;
    }
    public void ChangeBoxes(int CreatureBoxes)
    {
        double chance = Math.random();
        if(chance < 0.5) {
            CreatureBoxes = CreatureBoxes - 1;
        }
        else
        {
            CreatureBoxes = CreatureBoxes -2;
        }
        if(CreatureBoxes < 0)
            CreatureBoxes = 0;
        if(CreatureBoxes == 0)
        {
            System.out.println("You ran out of Creature Boxes, so you decided to go home");
            Runner.gameOff();
        }
    }
}
