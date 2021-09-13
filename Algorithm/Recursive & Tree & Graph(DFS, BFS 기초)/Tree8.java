import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree8 { //송아지 찾기 //상대트리검색(BFS)
	int answer =0;
	int[] dis= {1,-1,5};
	int[] ch;
	
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		ch=new int[10001]; //좌표
		ch[s] = 1; 
		Q.offer(s); //큐넣기
		int L=0; //카운트용
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0;i<len;i++) {//큐한줄돌기
				int x= Q.poll();
				for(int j=0;j<3;j++) {
					int nx=x+dis[j]; //가공한 값이 결과값과 같으면
					if(nx==e) {
						return L+1; //카운트 반환
					}
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx]=1; //스쳐간 수 기록
						Q.offer(nx);
					}
				}
				
				
			}
			
			L++;
		}
		return 0;
	}

	public static void main(String[] args){
		Tree8 T = new Tree8();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s, e));
	}	
}
