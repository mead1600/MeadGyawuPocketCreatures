package Game;

import Rooms.Board;
import Rooms.Road;
import Rooms.House;
import Rooms.Forest;

public class Runner {
    public static void main(String args)
    {
        Board[][] playingBoard = new Board[6][6];
        for(int x = 0; x < playingBoard.length;x++)
        {
            for(int y =0; y < playingBoard[x].length;y++)
            {
                playingBoard[x][y] = new Board(x,y);
                double randomPos = Math.random();
                if(randomPos < 0.33)
                {
                    for(int i = 0; i < 9;i++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        playingBoard[x][y] = new House(x, y);
                    }
                }
                else if(randomPos < 0.67)
                {
                    for(int a = 0; a < 9;a++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        playingBoard[x][y] = new Road(x, y);
                    }
                }
                else if(randomPos < 1.00)
                {
                    for(int b = 0; b < 4;b++) {
                        x = (int)(Math.random()*playingBoard.length);
                        y = (int)(Math.random()*playingBoard.length);
                        playingBoard[x][y] = new Forest(x, y);
                    }
                }
            }
        }
    }
}
