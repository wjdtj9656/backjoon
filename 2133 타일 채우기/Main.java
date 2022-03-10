import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int dp[] = new int[31];
		dp[0] = 1;
		dp[2] = 3;
		for(int i=4; i<=N; i+=2) {
			dp[i] = dp[i-2] * 3;
			int temp = i-4;
			while(temp != 0) {
				dp[i] += dp[temp] * 2;
				temp -= 2;
			}
			dp[i] += 2;
		}
		bw.write(String.valueOf(dp[N]));
		
		bw.flush();
		br.close();
		bw.close();
	}

}
