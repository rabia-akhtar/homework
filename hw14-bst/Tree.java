public class Tree {
    private Node r;

    public Tree (){
	r = null;
    }

    public Tree (Node n) {
	r = n;
    }
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


    public static void main (String[] args){


    }
}
