
public class Queue<E> {
	private Node<E> head;
	private Node<E> tail;

	public Queue(){
		// We want to initialize our Queue to be empty
		// (ie) set head and tail to be null
		head = null;
		tail = null;
	}

	public void enqueue(E newData){
		// Create a new node whose data is newData and whose next node is null
		// Update head and tail
		// Hint: Think about what's different for the first node added to the Queue
		Node<E> temp = new Node<E>(newData, null);
		if (isEmpty()) {
			head = temp;
			tail = temp;
		}
		else if (head == tail) {
			head.setNext(temp);
			tail = temp;
		}
		else {
			tail.setNext(temp);
			tail = temp;
		}
	}

	public Node<E> dequeue(){
		// Return the head of the Queue
		// Update head
		// Hint: The order you implement the above 2 tasks matters, so use a temporary node
		//	     to hold important information
		// Hint: Return null on a empty Queue
		if(isEmpty()) {
			return null;
		}
		Node<E> temp = head;
		head = head.getNext();
		return temp;
	}

	public boolean isEmpty(){
		// Check if the Queue is empty
		if (head == null) {
			return true;
		}
		return false;
	}

	public void printQueue(){
		// Loop through your queue and print each Node's data
		String printString = new String();
		while (!isEmpty()) {
			Node<E> temp = dequeue();
			printString += temp.getData();
		}	
		System.out.println("Queue Output: "+printString);
	}
}
