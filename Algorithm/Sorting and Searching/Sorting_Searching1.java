import java.util.Scanner;

public class Sorting_Searching1 { 
	//선택정렬 : 한바퀴씩 돌면서 제일 작은숫자를 찾음

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		//최솟값을 찾아서 앞에다 둠
		for(int i=0;i<N;i++) {
			int index=i;
			int min=Integer.MAX_VALUE;
			
			for(int j=i;j<N;j++) {
				
				if(arr[j]<min) { 					
					min=arr[j];		
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=min;	
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
