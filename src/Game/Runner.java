package Game;

import Rooms.Board;
import Rooms.Road;
import Rooms.House;
import Rooms.Forest;
import Rooms.Person;
import Creatures.Air;
import Creatures.Earth;
import Creatures.Fire;
import Creatures.Water;
import Creatures.Typing;

import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;


    public static void main(String[] args)
    {
        System.out.println("You are a legendary Pokemon Trainer . . . I mean Creature Tamer. \nYou have 10 Creature Boxes at the beginning of your trek through this town. \nYour job is to catch as many poke- I mean Creatures as possible. \nIf you run out of Creature Boxes, you lose. \nHowever, if you have too many Creature Boxes, like say 25 boxes, you will be forced to end and go home.");
        Board[][] playingBoard = new Board[6][6];
        int CreatureBoxes = 10;
        double chance = 0.0;
        Typing version = new Typing("");
        for(int x = 0; x < playingBoard.length;x++)
        {
            for(int y =0; y < playingBoard[x].length;y++)
            {
                playingBoard[x][y] = new Board(x,y);
                double randomPos = Math.random();
                if(randomPos < 0.33)
                {
                    for(int i = 0; i < 6;i++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0 && playingBoard[x][y] != new Road(x,y) && playingBoard[x][y] != new Forest(x,y))
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new House(x, y);
                    }
                }
                else if(randomPos < 0.67)
                {
                    for(int a = 0; a < 15;a++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0 && playingBoard[x][y] != new House(x,y) && playingBoard[x][y] != new Forest(x,y))
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new Road(x, y);
                    }
                }
                else if(randomPos < 1.00)
                {
                    for(int b = 0; b < 15;b++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0 && playingBoard[x][y] != new House(x,y) && playingBoard[x][y] != new Road(x,y))
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new Forest(x, y);
                    }
                }
            }
           /* for(int c = 0; c < playingBoard.length;c++)
            {
                for(int d = 0; d < playingBoard[c].length;d++)
                {
                    if(playingBoard[c][d] != new Horse(c,d) && playingBoard[c][d] != new Forest(c,d) && playingBoard[c][d] != new Board(c,d));
                    {
                        playingBoard[c][d] = new Board(c,d);
                    }
                }
            }*/
        }
        Person player1 = new Person( 0,0);
        playingBoard[0][0].enterRoom(player1, version, CreatureBoxes, chance);

        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, playingBoard, version, CreatureBoxes, chance))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                if(chance < 0.4)
                {
                    CreatureBoxes = CreatureBoxes + 2;
                    System.out.println("You found a couple Creature Boxes");
                }
                else
                {
                    CreatureBoxes = CreatureBoxes - 3;
                    System.out.println("You tripped and dropped a Creature Box");
                }
                chance = Math.random();
                //decideBoxes(chance, CreatureBoxes);
                System.out.println("You have " + CreatureBoxes + " Creature Boxes left.");
                //creatureCatch(version, CreatureBoxes);
            }
            else {
                System.out.println("Please choose a valid move.");
            }
            if(CreatureBoxes <= 0)
            {
                System.out.println("You ran out of Creature Boxes. You are pretty bad at catching these creatures");
                gameOff();
            }
            if(CreatureBoxes >= 25)
            {
                System.out.println("You are carrying WAY TOO many Pokeballs. I mean Creature Boxes. The fact that you have a lot shows that you are well prepared. You might also be pretty good at catching Pokemon . . . I mean Poket Creatures. ANyway, go home and enjoy yourself.");
                gameOff();
            }

        }
        in.close();

    }
    public static boolean validMove(String move, Person p, Board[][] map, Typing version, int CreatureBoxes, double chance)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p, version, CreatureBoxes, chance);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p, version, CreatureBoxes, chance);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p, version, CreatureBoxes, chance);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p, version, CreatureBoxes, chance);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }

    /*public static void creatureCatch(Typing version, int CreatureBoxes)
    {
        System.out.println("Would you like to catch this Pocket Creature?");
        Scanner choice = new Scanner(System.in);
        String answer = choice.nextLine();
        while(!(answer.toLowerCase().equals("y")) && !(answer.toLowerCase().equals("n")))
        {
            System.out.println("choose y or n please");
            choice = new Scanner(System.in);
            answer = choice.nextLine();
        }
        if(answer.equals("y"))
        {
            if(version.toString().equals("fire"))
            {
                new Fire(CreatureBoxes);
            }
            if(version.toString().equals("earth"))
            {
                new Earth(CreatureBoxes);
            }
            if(version.toString().equals("water"))
            {
                new Water(CreatureBoxes);
            }
            if(version.toString().equals("air"))
            {
                new Air(CreatureBoxes);
            }
        }
    }*/
    public static void gameOff()
    {
        gameOn = false;
    }
}
