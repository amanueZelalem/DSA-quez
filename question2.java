

class question2 {
    int size;
    int top;
    int[] numArray;
    Stacks(int capacity){ //constructor
        this.size = 0;
        numArray = new int[capacity];
        top = -1;
    }
    public int size(){
        return size;
    }

    void push(int value) {
        if(size != numArray.length){
            numArray[++top] = value;
            size++;;}
        else
            System.out.println("Stack is full");
        }
        public int pop(){
            if (size != 0 ){
                int data = numArray[top--];
                size--;
                return data;
               
            }
            return -1;

        }
        
        public int peek(){
            if (size != 0){
                return numArray[top];
            }
            return -1;
        }
}