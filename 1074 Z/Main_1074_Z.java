import java.util.*;
import java.io.*;

public class Main_1074_Z {
	static int N,R,C;
	static int result;
	public static void recursion(int n, int r, int c,int value) {
		if(n == 0) {
			result =value;
			return;
		}
		int temp = (int)Math.pow(2, n);
		int temp2 = temp/2;
		if(r >=0 && r < temp2 ) {
			//왼쪽위
			if(c >= 0 && c < temp2) {
				recursion(n-1,r,c,value+0);
			}//오른쪽 위
			else if(c >= temp2 && c < temp) {
				recursion(n-1,r,c-temp2,value+(int)Math.pow(4, n-1));
			}
		}
		else if(r >= temp2 && r < temp) {
			//왼쪽 아래
			if(c >= 0 && c < temp2) {
				recursion(n-1,r-temp2,c,value+(int)Math.pow(4, n-1)*2);
			}
			//오른쪽 아래
			else if(c >= temp2 && c < temp) {
				recursion(n-1,r-temp2,c-temp2,value+(int)Math.pow(4, n-1)*3);
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		recursion(N,R,C,0);
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}

}
