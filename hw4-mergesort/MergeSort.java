import java.io.*;
import java.util.*;

public class MergeSort {

    public MergeSort(){
       	ArrayList<Integer> l = new ArrayList<Integer>(7);
	Random r =  new Random();
	for (int i = 0; i<l.size();i++){
	    int x = r.nextInt(100);
	    l.set(i,x);
	}
    }
    public String toString (){
	String s;
	for (int y =0; y<l.size();y++){
	    s+=l.get(y);
	}
	return s;
    }
    public static void main (String[] args){

	MergeSort(l);
	System.out.println(MergeSort.toString());

    }
}
