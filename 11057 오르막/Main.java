import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		dp[0] = 10;
		dp[1] = 55;
		if(N >= 2) {
			for(int i=2; i<N; i++) {
				int temp = dp[i-1];
				dp[i] = dp[i-1];
				for(int j=10; j>1; j--) {
					dp[i] = (dp[i] + (temp - j))%10007;
					temp -= j;
				}
			}
		}
		bw.write(String.valueOf(dp[N-1] % 10007));
		
		bw.flush();
		bw.close();
	}
}
