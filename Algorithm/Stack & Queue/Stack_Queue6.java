import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_Queue6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> Q = new LinkedList<>();
		int answer=0;
		for(int i=1;i<=N;i++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int i=1;i<K;i++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size()==1) {
				answer=Q.poll();
			}
		}
		System.out.println(answer);
	}

}
