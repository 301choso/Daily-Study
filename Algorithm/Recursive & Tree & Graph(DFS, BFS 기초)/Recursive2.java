import java.util.Scanner;

public class Recursive2 { // 재귀함수를 이용한 이진수 출력

	public void DFS(int n) {
		if(n==0) {
			return; 
		}else {
			int num = n%2;
			DFS(n/2); 
			System.out.print(num); //출력
		}
	}
	
	public static void main(String[] args) { 		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Recursive2 rs = new Recursive2();
		rs.DFS(N);

	}

}
