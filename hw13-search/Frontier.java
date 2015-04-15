import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    public Node remove() {
	Node thing;
	int p;
	for (Node tmp = l; tmp!=null; tmp=tmp.getNext()) {
	    if (tmp.getPrio()>p)
		{
		    thing = tmp;
		    p = tmp.getPrio();
		    tmp=tmp.getNext();
		}

	}	
	return thing;
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










