import java.util.Scanner;

public class Recursive1 { //재귀함수로 1부터 N까지 출력

	public void DFS(int n) {
		if(n==0) {
			return; //0이면 끝
		}else {
			DFS(n-1); //1 줄여서 호출
			System.out.print(n+" "); //출력
		}
	}
	
	public static void main(String[] args) { 		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Recursive1 rs = new Recursive1();
		rs.DFS(N);
		
	}
}
