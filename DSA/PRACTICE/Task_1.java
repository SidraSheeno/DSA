class Task_1 {

    private int Array[];    
    private int Top;        
    private int Capacity;   

    Task_1(int size) {
        Array = new int[size];  
        Capacity = size;      
        Top = -1;             
    }


    public void Push(int x) {
        if (isFull()) {

            System.out.println("Stack Overflow");
            return;
        }

        Array[++Top] = x; 
        System.out.println("Inserted " + x);
    }

    public int Pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");  
            return -1;
        }
        System.out.println("Popped " + Array[Top]);
        return Array[Top--];  
    }

    
    public int Top() {
        if (!isEmpty()){
            return Array[Top];
        }
        System.out.println("Stack is empty");
        return -1;  
    }
    
    public int size() {
        return Top + 1;  
    }
    public Boolean isEmpty() {
        return Top == -1;  
    }
    public Boolean isFull() {
        return Top == Capacity - 1;  
    }
    public static void main(String[] args) {
        Task_1 stack = new Task_1(3);  

        stack.Push(1);  
        stack.Push(2);  

        stack.Pop();  
        stack.Pop();  

        stack.Push(3);  

        System.out.println("Top element is: " + stack.Top());  
        System.out.println("Stack size is " + stack.size());

        stack.Pop(); 

        if (stack.isEmpty()) {
            System.out.println("Stack Is Empty");
        } else {
            System.out.println("Stack Is Not Empty");
        }
    }
}
