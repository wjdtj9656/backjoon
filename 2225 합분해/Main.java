import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int K = Integer.parseInt(st.nextToken());
	    	int dp[][] = new int[N+1][K+1];
	    	for(int i=1; i<=N; i++) {
	    		dp[i][1] = 1;
	    	}
	    	for(int i=1; i<=K; i++) {
	    		dp[1][i] = i;
	    	}
	    	for(int i=2; i<=N; i++) {
	    		for(int j=2; j<=K; j++) {
	    			dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000000; 
	    		}
	    	}
	    	bw.write(String.valueOf(dp[N][K]));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}