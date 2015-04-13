public class myQueue<E> {
    
    private Node<E> first = new Node<E>();
    private Node<E> last = new Node<E>();

    public myQueue() {
	first.setNext(last);
    }
    public void enqueue(Node n) {
	last.setNext(n);
	last = n;
    }
   
   public Node dequeue() {
	Node tmp = first.getNext();
	first.setNext(first.getNext().getNext());
	return tmp;
    }

    public boolean empty(){
	return (first.getData() == null);
    }

    public E head() {
        // return the first item in the queue
	return first.getData();
     }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=first ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
  
    
}
