import java.util.*;
public class LList {
    private Node l;
    public LList (){
	l= null;
    }
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
    public int len () {
	Node tmp;
	int len=0;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    len++;
	}
	return len;
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
    public String get(int n){
	Node result = l.getNext();
	for (int i = 1; i < n && result.getNext() !=null; i++){
		result = result.getNext();
	}
	return result.getData();
    }
    public void add (int n, String s){
	Node sert =  new Node(s);
	Node current;
	int num = 0;
	if (n == 0) add(s);
	    else 
		{
	for (current = l; num < n-1 && current != null; current=current.getNext()){
	    num++;
	}
	sert.setNext (current.getNext());
	current.setNext(sert);
		}
    }
    public String remove (int n){
	if (n >= len() || n < 0) return "";
	Node current = l;
	for (int i = 0; i <n-1; i++) {
	    current = current.getNext();
	}
	String s = current.getNext().getData();
	current.setNext(current.getNext().getNext());
	return s;
   
    }
    public static void main(String[] args) {
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	l.add(3,"a");
	System.out.println(l);
	System.out.println(l.get(3));
	l.remove(3);
	System.out.println(l);
    }
		
}
