public class Tree {
    private Node root;

    public Tree (){
	root = null;
    }

    public Tree (Node n) {
	root = n;
    }


    public Node search (Node t, int i) {
	while (t!= null) {
	    int c =t.getData().compareTo(i);
	    if (c>0) t=t.getRight();
	    else {
		if (c<0) t = t.getLeft();
		else return t;

	    }
	    return null;
	}

	public void insert (Node t, int i){

    }


    public static void main (String[] args){


    }
}
