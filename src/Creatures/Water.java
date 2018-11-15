package Creatures;

import Game.Runner;

public class Water{
    public Water(double chance)//int CreatureBoxes)
    {
        ChangeBoxes(chance);//CreatureBoxes);
    }
    public void ChangeBoxes(double chance)//nt CreatureBoxes)
    {
        //double chance = Math.random();
        if(chance < 0.5)
        {
            //CreatureBoxes = CreatureBoxes -1;
            System.out.println("You threw your creature box and you managed to successfully catch WaterLilly. Your WaterLilly will be added to the CPU and Nurse May will be watching over it at the Creature Center. There you picked up 2 Creature Boxes");
        }
        else
        {
            //CreatureBoxes = CreatureBoxes -2;
            System.out.println("You threw 1 Creature Boxs in the lake in the lake and missed. It sunk. You decided to leave to avoid any further embarrassment");
        }
        /*if(CreatureBoxes < 0)
            CreatureBoxes = 0;
        if(CreatureBoxes == 0)
        {
            System.out.println("You ran out of Creature Boxes, so you decided to go home");
            Runner.gameOff();
        }*/
    }
}
