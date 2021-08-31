import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Searching6 { //장난꾸러기
	//정렬한 배열을 만들어 비교한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		int[] arr= new int[S];
		
		for(int i=0;i<S;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> answer = new ArrayList<>(); //정답용
		//깊은복사
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i=0;i<S;i++) {
			if(arr[i]!=tmp[i]) {
				answer.add(i+1);
			}			
		}
		for(int i :answer) {
			System.out.print(i+" ");
		}
		
	}

}
