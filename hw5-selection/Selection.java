import java.io.*;
import java.util.*;

public class Selection {

    private int[] nums;
    public Selection (){
	nums=new int[]{81,5,7,1,9,11,2};
    }
    public int Select(int[] A, int k, int l, int h){
	/*
	  That will return the kth smallest element in Array A.
	  The first call will be Select(A,k,0,A.length-1)
	  because you're looking in the full array.

	  Use the partition algorithm we outlined in class and 
	  when you make the recursive call update l and h accordingly.
	*/
	int low = l;
	int high = h-1;
	int pivot= A[l];
	int index = 0;
	//switches the two
	int first= A[l];
	int second= A[h];
	A[l]=second;
	A[h]=first;
	while(low < high) {
	    if (A[low] < pivot) {
		low++;
	    } else {
		int uno= A[low];
		A[low]= A[high];
		A[high]=uno;	
		high--;
	    }
	}
	if (A[low] < pivot){
	    A[h] = A[low + 1];
	    index = low + 1;
	    A[index] = pivot;

	}
        if (A[low] > pivot){
	    A[h] = A[low];
	    index = low;
	    A[index] = pivot;
	}
	//rec
	if (low < k) {
	    Select(A,k,index+1,h);
	}
        if (low > k) {
	    Select(A,k,l,index-1);
	}
	return A[k];
    }
    public static void main (String[] args){
	Selection m =  new Selection();
        System.out.println(m.Select(m.nums,4,0,m.nums.length-1));
	//hm something is off
    }
}


