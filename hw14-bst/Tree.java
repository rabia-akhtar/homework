import java.io.*;
import java.util.*;
public class Tree {
    private Node r;

    public Tree (){
	r = null;
    }

    public Tree (Node n) {
	r = n;
    }

    /*
      public void insert (Node t, int i){
      Node in = new Node(i);
      if (t == null)
      t = in;
      Node tmp = t;
      Node x = null;
      while (tmp != null){
      x  = tmp;
      int c = t.getData().compareTo(i);
      if (c < 0)
      tmp = tmp.getRight();
      else if (c > 0)
      tmp = tmp.getLeft();
      }
      if (i > x.getData())
      x.setRight(in);
      else if (i < x.getData())
      x.setLeft(in);
      }

      public Node search (Node t, int i) {
      while (t!= null) {
      int c =t.getData().compareTo(i);
      if (c>0) t=t.getRight();
      else {
      if (c<0) t = t.getLeft();
      else return t;

      }
      }
      return null;
	
      }

    */

    //classcode
    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    public string Traverse (Node t) {
	String s;
	if (t==null) return " ";
	else {
	    s += Traverse(t.getLeft());
	    s += t;
	    s += Traverse(t.getRight());
	    return s;
	}
    }

    public String toString () {

	return "";
    }

    public static void main (String[] args){
	
	Tree t = new Tree();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
	System.out.println(Traverse(t.getData()));
    }
}
