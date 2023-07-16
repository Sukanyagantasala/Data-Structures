package datastructures;




class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root=null;
		
	}
	public void insert(int data) {
		root=insertRecursive(root,data);
		
	}
  Node insertRecursive(Node root,int data) {
  	if(root==null) {
//  		Node newNode=new Node(data);
  		root=new Node(data);
  		return root;
  		
  	}
  	if(data<root.data) {
  		root.left=insertRecursive(root, data);
  	}
  	else if(data>root.data) {
  		root.right=insertRecursive(root, data);
  		
  	}
  	return root;
  }
	void preorder(Node root) {
		if(root!=null) {
			System.out.println(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
		bst.preorder(bst.root);
     //pre-order:5,3,2,4,8,7,9
	}

}




