package Creatures;

import Game.Runner;

public class Air{
    public Air(double chance)//int CreatureBoxes)
    {
        ChangeBoxes(chance);//CreatureBoxes);
    }
    public void ChangeBoxes(double chance)//nt CreatureBoxes)
    {
        //double chance = Math.random();
        if(chance < 0.5)
        {
            //CreatureBoxes = CreatureBoxes -1;
            System.out.println("You threw your creature box and you managed to successfully catch Windo. Your Windo will be added to the CPU and Nurse May will be watching over it at the Creature Center. There you picked up 2 Creature Boxes");
        }
        else
        {
            //CreatureBoxes = CreatureBoxes -2;
            System.out.println("The Windo flapped its wings and let out a giant gust of air. Tis forced you to drop 1 Creature Boxes. It then ran away from you. What a windy day.");
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
