import java.io.*;
import java.util.*;
import java.lang.System;

public class Driver {
    public static void main (String[] args) {
	Random r = new Random();
	int sumarray=0;
	int sumllist=0;
	int sumlinkedlist;
	long start,elapsed;

	ArrayList<Integer> nums= new ArrayList<Integer>();
	for (int i = 0; i<10;i++){
	    int tmp = r.nextInt(11);
	    nums.add(tmp);
	   sumarray+= nums.get(i);
	}
	start =System.currentTimeMillis();
	elapsed =System.currentTimeMillis() - start;
	System.out.println ("ArrayList time is:" + elapsed);

	LList l = new LList();
	for (int i=0; i < 10; i++){
	    int tmp = r.nextInt(11);
	    l.add(tmp);
	    sumllist+=l.get(i);
	}
	start =System.currentTimeMillis();
	elapsed =System.currentTimeMillis() - start;
	System.out.println ("LList time is:" + elapsed);
	LinkedList n = new LinkedList();
	for (int i=0; i < 10; i++){
	    int tmp = r.nextInt(11);
	    n.add(tmp);
	    sumlinkedlist+= n.get(i);
	}
	start =System.currentTimeMillis();
	elapsed =System.currentTimeMillis() - start;
	System.out.println ("LinkedList time is:" + elapsed);


    }
}
