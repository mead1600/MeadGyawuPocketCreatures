package Game;

import Rooms.Board;
import Rooms.Road;
import Rooms.House;
import Rooms.Forest;
import Rooms.Person;

import java.util.Scanner;

public class Runner {
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Board[][] playingBoard = new Board[6][6];
        int CreatureBoxes = 10;
        //Board type = "";
        for(int x = 0; x < playingBoard.length;x++)
        {
            for(int y =0; y < playingBoard[x].length;y++)
            {
                playingBoard[x][y] = new Board(x,y);
                double randomPos = Math.random();
                if(randomPos < 0.33)
                {
                    for(int i = 0; i < 3;i++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0)
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new House(x, y);
                    }
                }
                else if(randomPos < 0.67)
                {
                    for(int a = 0; a < 6;a++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0)
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new Road(x, y);
                    }
                }
                else if(randomPos < 1.00)
                {
                    for(int b = 0; b < 6;b++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        while(x == 0 && y == 0)
                        {
                            x = (int)(Math.random()*playingBoard.length);
                            y = (int)(Math.random()*playingBoard.length);
                        }
                        playingBoard[x][y] = new Forest(x, y);
                    }
                }
            }
        }
        Person player1 = new Person( 0,0);
        playingBoard[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, playingBoard))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();

    }
    public static boolean validMove(String move, Person p, Board[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
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
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
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
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
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
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
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
    public static void gameOff()
    {
        gameOn = false;
    }
}
