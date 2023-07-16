package datastructureandalgorithms;

public class Stack {
	public static Object[] stackarray;
	private static int size;
	private static int top;
	public Stack(int size)
	{
		this.size=size;
		this.top=-1;
		stackarray=new Object[size];
	}
    public void push(Object value) {
    	if(top==size-1) {
    		 System.out.println("Stack is Full");
    	}
    	else {
    		top++;
            stackarray[top]=value;
            size++;
    	}
    }
    public Object pop() {
    	if(top==-1) {
    		System.out.println("Stack is Empty");
    	    return -1;
    	}
    	else {
    	
    		int oldtop=top;
    		top--;
    		stackarray[oldtop]=null;
    		return stackarray[oldtop];
       }
    }
    public Object peek()
    {
    	return stackarray[top];
    }
    public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		//System.out.println(s.peek());
		
		for(int i=0;i<=top;i++)
			System.out.println(stackarray[i]);
		    System.out.println(s.pop());
		    System.out.println(s.peek());
		   
		    
		
	}
}
