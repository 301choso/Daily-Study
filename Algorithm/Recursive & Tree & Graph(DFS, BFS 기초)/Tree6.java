
public class Tree6 {//나올 수 있는 모든 부분집합 경우 구하기(DFS)
	static int n;
	static int[] ch;
	
	public void DFS(int L) {
		
		if(L==n+1) {
			String tmp="";
			for(int i=1;i<=n;i++) {
				if(ch[i]==1) {
					tmp+=(i+" "); //숫자를 문자로 형변환
				}
			}
				if(tmp.length()>0) { //공집합은 없다는 조건
					System.out.println(tmp);
				}
			
		}else {
			ch[L]=1;
			DFS(L+1);
			
			ch[L]=0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) { 
		Tree6 t = new Tree6();
		n=3;
		ch = new int[n+1];
		t.DFS(1);
	}

}
