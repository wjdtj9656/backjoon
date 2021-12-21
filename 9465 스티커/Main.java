import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N;
	static int arr[][], dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[2][N];
			dp = new int[2][N+1];
			for(int j=0; j<2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0; k<N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			dp[0][1] = arr[0][0];
			dp[1][1] = arr[1][0];
			
			for(int k=2; k<=N; k++) {
				dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + arr[0][k-1];
				dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + arr[1][k-1];
			}
			bw.write(String.valueOf(Math.max(dp[0][N], dp[1][N]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
