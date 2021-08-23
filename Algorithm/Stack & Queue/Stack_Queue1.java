import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		String answer="YES";
		for(Character i : str.toCharArray()) {
			if(i=='(') { // ( 입력
				stack.push(i);
			}else {
				if(stack.isEmpty()) { //비어있는데 ) 가 나오면
					answer="NO";
					break;
				}else {
					stack.pop(); // (가 ) 만나면 사라짐
				}
			}
		}
		if(!stack.isEmpty()) { //여는 괄호가 남아있음
			answer="NO";
		}
		System.out.println(answer);
	}

}
