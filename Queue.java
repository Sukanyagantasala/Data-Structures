package datastructureandalgorithms;

 public class  Queue1{
	  int Max=5;
	int front=0;
	int rear=-1;
	int size=0;
	int a[]=new int[Max];
	
	public boolean isFull() {
		if(size==Max) {
			return true;
		}
		return false;
	}
	public void Enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Full.Remove some Elements");
		}
		rear=(rear+1)%Max;
		size++;
		a[rear]=val;
	}
    public boolean isEmpty() {
    	if(size==0) {
    		return true;
    	}
        return false;
    }
    public int Dequeue() {
    	if(isEmpty()) {
    		System.out.println("Queue is Empty");
    	}
    	front=front%Max;
    	size--;
    	return a[front++];
    }
    public int getSize() {
    	return size;
    }
    
    public int getRear() {
    	if(isEmpty()) {
    		System.out.println("Queue is Empty.No Element at Rear");
    		return -1;
    	}
    	return a[rear];
    }
    
    public int getFront() {
    	if(isEmpty()) {
    		System.out.println("Queue is Empty.No Element at Front");
    		return -1;
    	}
    	return a[front];
    }


    public static void main(String[] args) {
		Queue1 a=new Queue1();
		a.Enqueue(12);
		a.Enqueue(2);
		a.Enqueue(7);
		a.Enqueue(27);
		a.Enqueue(18);
		a.Enqueue(80);
		System.out.println("Size : " + a.getSize());
		System.out.println("Rear : " + a.getRear());
		System.out.println("Front : " + a.getFront());
		System.out.println("Removing : " + a.Dequeue());
		System.out.println("Rear : " + a.getRear());
		System.out.println("Front : " + a.getFront());
		
		//a.Dequeue();
	}
}
