package Creatures;

import Game.Runner;

public class Earth{
    public Earth(int CreatureBoxes) {
        earthBoxes(CreatureBoxes);
    }
    public void earthBoxes(int CreatureBoxes){
        double chance = Math.random();
        if(chance < 0.5)
        {
            CreatureBoxes = CreatureBoxes -1;
            System.out.println("You threw your creature box and you managed to successfully catch Groundy. Your Groundy will be added to the CPU and Nurse May will be watching over it at the Creature Center.");
        }
        else
        {
            CreatureBoxes = CreatureBoxes -3;
            System.out.println("Groundy set you off balance, forcing you to lose 3 Creature Boxes. It then ran away from you. What a rude creature.");
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
