import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next(); 
		
		String answer = "NO";
		Stack<Character> S = new Stack<>();
		Queue<Character> Q = new LinkedList<>();
		
		for(int k=B.length()-1;k>=0;k--) {
			S.push(B.charAt(k));
		}
		
		for(int i=0;i<A.length();i++) {
			Q.offer(A.charAt(i));
		}
				
		for(int i=0;i<B.length();i++) {
			
			if(Q.isEmpty()) {
				answer="YES";
				break;
			}			
			if(B.contains(Q.peek().toString())) {
				if(S.peek()==Q.peek()) {
					Q.poll();
				}
				S.pop();
			}else {
				break;
			}		
		}
		
		System.out.println(answer);
		
	}
}
