import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.next();
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<n.length();i++) {
			if((int)n.charAt(i)>=48 && (int)n.charAt(i)<=57) { //Character.isDigit(x)Character.isDigit(n.charAt(i))
				stack.push(n.charAt(i)-48);
			}else {
				int rt=stack.pop();
				int lt=stack.pop();
				
				if(n.charAt(i)=='+') {
					stack.push(lt + rt); 
				}else if(n.charAt(i)=='-') {
					stack.push(lt - rt); 
				}else if(n.charAt(i)=='*') {
					stack.push(lt * rt);
				}else if(n.charAt(i)=='/') {
					stack.push(lt / rt); 
				}
				
			}
		}
		
			System.out.println(stack.get(0));
			
	}

}
