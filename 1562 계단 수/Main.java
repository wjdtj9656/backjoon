import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long dp[][][] = new long[N][10][1<<10];
		long result = 0;
		int mod = 1000000000;
		for(int i=1; i<=9; i++) {
			dp[0][i][1<<i] = 1;
		}
		for(int i=1; i<N; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<(1<<10); k++) {
					int visit = k | 1<<j;
					if(j==0) {
						dp[i][j][visit] += dp[i-1][j+1][k] % mod;
					}
					else if(j==9) {
						dp[i][j][visit] += dp[i-1][j-1][k] % mod;
					}
					else {
						dp[i][j][visit] += dp[i-1][j-1][k] % mod + dp[i-1][j+1][k] % mod;
					}
					dp[i][j][visit] %= mod;
				}
			}
		}
		for(int i=0; i<=9; i++) {
			result += dp[N-1][i][(1<<10)-1] % mod;
			result %= mod;
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.close();
	}

}
