
	class Node{ //이진트리 순회(깊이우선탐색)
	    int data; 
	    Node lt, rt; //주소를 저장
	    public Node(int val) { 
	        data=val; 
	        lt=rt=null; 
	    } 
	} 
	public class Tree5 { 
	
	    Node root; //객체의 주소 저장(참조형)
	    public void BFS(Node root){
	    	if(root==null) return;
	    	else {
	    		System.out.print(root.data+" ");//전위순회
	    		BFS(root.lt);
	    		//여기에서 출력하면 중위순회
	    		BFS(root.rt);
	    		//여기에서 출력하면 후위순회
	    	}
	    }

	    public static void main(String args[]) { 
	    	Tree5 tree=new Tree5(); 
	        tree.root=new Node(1); 
	        tree.root.lt=new Node(2); 
	        tree.root.rt=new Node(3); 
	        tree.root.lt.lt=new Node(4); 
	        tree.root.lt.rt=new Node(5); 
			tree.root.rt.lt=new Node(6); 
	        tree.root.rt.rt=new Node(7);
	        tree.BFS(tree.root); 
	    } 
} 




