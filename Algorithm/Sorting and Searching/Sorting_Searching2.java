import java.util.Scanner;

public class Sorting_Searching2 { 
	//버블정렬 : 이웃한 두 수 비교해서 바꿈(파도타듯 밀고가서 뒤에서부터 정렬됨)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}			
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
