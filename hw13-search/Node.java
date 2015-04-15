
public class Node {
    private int x,y;
    private Node prev;
    private int priority;		
    public Node(int x, int y, int prio){
	this.x = x;
	this.y = y;
	priority = prio;
    }

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getPrio() {
	return priority;
    }

    public int setPrio(int n){
	priority = n;
    }
		
}










