
	class Node5{ //이진트리 순회(깊이우선탐색)
	    int data; 
	    Node5 lt, rt; //주소를 저장
	    public Node5(int val) { 
	        data=val; 
	        lt=rt=null; 
	    } 
	} 
	public class Tree5 { 
	
	    Node5 root; //객체의 주소 저장(참조형)
	    public void BFS(Node5 root){
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
	        tree.root=new Node5(1); 
	        tree.root.lt=new Node5(2); 
	        tree.root.rt=new Node5(3); 
	        tree.root.lt.lt=new Node5(4); 
	        tree.root.lt.rt=new Node5(5); 
			tree.root.rt.lt=new Node5(6); 
	        tree.root.rt.rt=new Node5(7);
	        tree.BFS(tree.root); 
	    } 
} 




