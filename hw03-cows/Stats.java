import java.io.*;
import java.util.*;

public class Stats {
    ArrayList<int[]> nums = new ArrayList<int[]>();
    nums.add(12);
    nums.add(4);
    nums.add(6);
    nums.add(8);
    nums.add(2);
    nums.sort();
    public String toString()
    {
	String s = "[2J\n";				
	for ( int x=0;x<5;x++){
	    s = s + nums[x];
	    s=s+"\n";
	}
	return s;
    }
    public static void main (String[] args) {
	Stats m = new Stats();
	System.out.println(m);

    }
}
