import java.util.*;
import java.io.*;

public class Merge {
    public ArrayList<Integer> Merge(ArrayList<Integer> a, ArrayList<Integer> b){
	/*
	  a and b are ArrayLists that are alread sorted from low to high.
	  They could be empty

	  build and return a sorted ArrayList using the merge technique we
	  discussed in class
	*/
	ArrayList<Integer> s= new ArrayList<Integer>();
	for (int i=0;i<20;i++){
	    if (a.size()==0){
		s.addAll(b);
		b.clear();
	    }
	    else {
		if (b.size()==0){
		    s.addAll(a);
		    a.clear();
		}
		else {
		    if (b.get(0)<a.get(0)){
			    s.add(b.get(0));
			    b.remove(0);
			}
			else {
			    s.add(a.get(0));
			    a.remove(0);
			}
		       

		    }
	    }
	}
	return s;
    }


public static void main(String[] args) {
	Merge work=new Merge();
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> b=new ArrayList<Integer>();
	Random r =  new Random();
	for (int i = 0; i<10;i++){
	    int x = r.nextInt(10);
	    a.add(x);
	}
	Random rand =  new Random();
	for (int i = 0; i<10;i++){
	    int y = rand.nextInt(30);
	    b.add(y);
	}
	Collections.sort(a);
	Collections.sort(b);
	System.out.println(a);
	System.out.println(b);
	System.out.println(work.Merge(a,b));



}
}
