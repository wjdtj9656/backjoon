import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	2606 problem 바이러스
	*/
	static boolean visit[];
	static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int pair = Integer.parseInt(br.readLine());
		int arr[][] = new int[num+1][num+1];
		int num1,num2;
		visit = new boolean[num+1];
		for(int i=0; i<pair; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			num1 =Integer.parseInt(st.nextToken());
			num2 =Integer.parseInt(st.nextToken());
			arr[num1][num2] = arr[num2][num1] = 1;
		}
		dfs(1,num,arr);
		System.out.println(count);
		bw.flush();
		bw.close();
	}
	public static void dfs(int i,int num,int arr[][]) {
		visit[i] = true;
		for(int j=1; j<=num; j++) {
			if(arr[i][j] == 1 && visit[j] == false) {
					count++;
					dfs(j,num,arr);
			}
		}
	}
}
