import java.util.Scanner;

public class Sorting_Searching3 { 
	//삽입정렬 : 정렬하면서 뒤로 옴(뒤로 민다.)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<N;i++) {
			int tmp=arr[i], j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>tmp) {
					arr[j+1]=arr[j]; //한칸미루기
				}else {
					break;
				}
				
			}
			arr[j+1]=tmp; //한바퀴 끝나면 멈춘 j+1번째에 tmp 넣기
		}
		
		for(int i :arr) {
			System.out.print(i+" ");
		}
		
	
	}

}
