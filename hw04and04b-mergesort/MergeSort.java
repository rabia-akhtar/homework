import java.io.*;
import java.util.*;

public class MergeSort {
   
    ArrayList<Integer> l = new ArrayList<Integer>();
      
	
    public MergeSort(){
	Random r =  new Random();
	for (int i = 0; i<7;i++){
	    int x = r.nextInt(100);
	    l.add(x);
	}

    }
    
    public static void main (String[] args){

	MergeSort m = new MergeSort(l);
	System.out.println(l);

    }
}
