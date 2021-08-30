import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	
	int id;
	int priority;
	
	public Person(int id, int priority) {
		
		this.id = id;
		this.priority = priority;
	}
	
}

public class Stack_Queue8 {	
	public int solution(int N, int M, int[] arr){
		int answer=0;
		Queue<Person> que = new LinkedList<>();
		for(int i=0;i<N;i++) {
			que.offer(new Person(i,arr[i])); //값 입력
		}
		while(!que.isEmpty()) {
			Person tmp = que.poll();
			for(Person x : que) {
				if(x.priority>tmp.priority) {
					que.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) { 
				answer++;
				if(tmp.id==M) {
					return answer;
				}
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt(); //실제 값 있는 배열
			
		}
		Stack_Queue8 T = new Stack_Queue8();
		System.out.println(T.solution(N,M,arr));
	}
}

