public class Queue {
	 private int[] numbers;
	 private int front;
	 private int rear;
	 private int nItems;
	 private int maxSize;
	public Queue(int maxSize) {
		 this.maxSize = maxSize;
		 numbers = new int[maxSize];
		 front = 0;
		 rear = -1;
		 nItems = 0;
	}
	public boolean isEmpty() {
	 return nItems == 0;
 }
	public boolean isFull() {
 		return nItems == maxSize;
 }
	public int peek() {
		if (isEmpty()) {
	 	throw new IllegalStateException("Queue is empty. Cannot peek.");
	 	}
	 	return numbers[front];
	 }
	public void enqueue(int value) {
	 	if (isFull()) {
			 System.out.println("Queue is full. Cannot enqueue element " + value);
		 }
	 	if (rear == maxSize - 1) {
			 rear = -1;
	 	}
	 numbers[++rear] = value;
	 nItems++;
	 }
	public int dequeue() {
		 if (isEmpty()) {
			 System.out.println("Queue is empty. Cannot dequeue.");
		 }
		 int frontValue = numbers[front++];
		 
		 if (front == maxSize) {
		 	front = 0; 
		 }
		 nItems--;
		 return frontValue;
	}
}
		 