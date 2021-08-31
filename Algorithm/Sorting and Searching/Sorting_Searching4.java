import java.util.Scanner;

public class Sorting_Searching4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr= new int[S];
		
		
		for(int i=0;i<N;i++) {
			int num=sc.nextInt();
			boolean flag = true;
			
			for(int j=0;j<S;j++) {
				
				if(num==arr[j]) { //같은 수가 있으면
					int tmp=arr[j];
					flag = false;				
					for(int k=j;k>0;k--) { //한칸씩 밀고									
						arr[k]=arr[k-1];
						
					}
					arr[0]=tmp;
					break;
				}
			}
			
			if(flag) {
				for(int m=S-1;m>0;m--) {
					int tmp=arr[m];
					arr[m]=arr[m-1];
					arr[m-1]=tmp;
				}	
				arr[0]=num;
			}			
		
		}
		for(int i=0;i<S;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
