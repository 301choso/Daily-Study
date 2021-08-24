import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt=0;
		Stack<Character> stack = new Stack<>();
		StringBuilder st = new StringBuilder();
		for(Character i : str.toCharArray()) {
			if(i=='(') {
				stack.push(i);
				cnt++;
			}else if(i==')') {
				if(cnt>=1) {
					cnt--;
					stack.pop();
				}
			}else {
				if(cnt==0) {
					st.append(i);
				}
			}
		}
		System.out.println(st.toString());
		
	}
}
