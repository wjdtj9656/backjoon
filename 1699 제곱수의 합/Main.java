import java.util.*;
import java.io.*;
	
	class Main {
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	int num = Integer.parseInt(br.readLine());
	    	
	    	int dp[] = new int[num+1];
	    	dp[1] = 1;
	    	for(int i=2; i<=num; i++) {
	    		dp[i] = i;
	    		for(int j=1; j*j <= i; j++) {
	    			dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
	    		}
	    	}
	    	bw.write(String.valueOf(dp[num]));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}