import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Searching5 { //중복확인

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		int[] arr= new int[S];
		
		for(int i=0;i<S;i++) {
			arr[i]=sc.nextInt();
		}
		//정렬시키고 옆에꺼랑 비교해서 크기가 같으면 D를 반환한다.
		
		Arrays.sort(arr);
		String answer = "U";
		for(int i=1;i<S-1;i++) {
			if(arr[i]<=arr[i-1]) {
				answer="D";
				break;
			}
		}
		System.out.println(answer);
	}
}
