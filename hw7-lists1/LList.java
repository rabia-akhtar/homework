import java.util.*;
public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public Object find (int n){
	Node result = l.getNext();
	for (int i = 1; i < n && result.getNext() !=null; i++){
		result = result.getNext();
	}
	return result.getData();
    }
    public void insert (int n, String s){
	Node sert =  new Node(s);
	Node current;
	int num = 0;
	for (current = l; num < n-1 && current != null; current=current.getNext()){
	    num++;
	}
	sert.setNext (current.getNext());
	current.setNext(sert);
    }
    public static void main(String[] args) {
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	l.insert(3,"a");
	System.out.println(l);
	System.out.println(l.find(3));
    }
		
}
