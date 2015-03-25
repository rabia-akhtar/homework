import java.io.*;
import java.util.*;

public class Makelake {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    public Makelake()
    { 
	Random r =  new Random();
	int R = 3 + r.nextInt(98);	
	Random c =  new Random();
	int C = 3 + c.nextInt(98);
	Random rand = new Random();		
	for ( int i=0;i<C;i++){
	    for (int y = 0; y<R; y++){
		nums[y][i]=10+ rand.nextInt(4991);
	    }     
	}
    }
    public String toString(){
	String s;
	for ( int i=0;i<C;i++){
	    for (int y = 0; y<R; y++){
		String s += nums[y][i];
	    }     
	    String s += "\n";
	}
	return s;
    }
    public static void main (String[] args) {
	Makelake m = new Makelake();
	System.out.println(m.toString);
    }
}
