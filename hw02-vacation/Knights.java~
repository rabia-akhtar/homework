//uses Maze base code
import java.io.*;
import java.util.*;

public class Knights 
{
    private int[][] board;
    private int maxX;
    private int maxY;
    private int tries;

    private int free = 0;
    private int me = 5;
    private int visited = 9;
    private boolean solved = false;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Knights() 
    {
	maxX=8;
	maxY=8;
	board = new int[maxX][maxY];
				
    }	
    public String toString()
    {
	String s="";				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    
    public void solve(int x, int y){
	if (solved || board[x][y]!=0){
	    return;
	}

	if (tries == maxX * maxY){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
        solve(x+1,y+2);
	solve(x-1,y+2);
	solve(x+1,y-2);
	solve(x-1,y-2);
	solve(x+2,y+1);	
	solve(x-2,y+1);
	solve(x+2,y-1);
	solve(x-2,y-1);
	tries+=1;
	board[x][y]=9;
	if (!solved){
	    tries-=1;
	    board[x][y]=0;
	}
    }
		
    public static void main(String[] args){
	Knights m = new Knights();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
		
    }
}

