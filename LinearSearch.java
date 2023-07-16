package datastructureandalgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,8,2,10,15,5};
		//int search=100;
		int search=8;
		int temp=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==search)	{
		    	temp=-1;
		    	System.out.println("Value is find "+arr[i]);
		    }
		}
		if(temp!=-1)
        System.out.println("Did not find the value: "+search);
	}
     
}
