import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] board = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		
		int M= sc.nextInt();
		int[] moves = new int[M];
		for(int i=0;i<M;i++) {
			moves[i]=sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		// moves 배열에 있는 것 -> board 배열 열번호의 가장 위에 있는 것(0이 아닌 것)
		// stack에 저장할때 같은 것이 있으면 pop한다.
		int cnt=0;
		for(int i=0;i<moves.length;i++) {
			
			for(int j=0;j<n;j++) {
				if(board[j][moves[i]-1]!=0 ) { 
					if(stack.peek()==board[j][moves[i]-1]) {
					
						stack.pop(); 
						cnt+=2;
						
					}else {
						stack.push(board[j][moves[i]-1]);
						
					}	
					board[j][moves[i]-1]=0;
					break;
				}		
				
			}
		}	

		//첫 줄에 터트려져 사라진 인형의 개수를 출력
		System.out.println(cnt);
	}

}
