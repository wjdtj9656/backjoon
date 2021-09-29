import java.util.*;
import java.io.*;

class Main {
	
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	int dp[][] = new int[n+1][10];
    	int result = 0;
    	
    	dp[0][0] = 0;
    	for(int i=1; i<10; i++) {
    		dp[0][i] = 1;
    	}
    	for(int i=2; i<=n; i++){
    		dp[i-1][0] = dp[i-2][1];
    		dp[i-1][9] = dp[i-2][8];
    		for(int j=1; j<=8; j++) {
    			dp[i-1][j] = (dp[i-2][j-1] + dp[i-2][j+1])%1000000000;
    		}
    	}
    	for(int i=0; i<=9; i++) {
    		result = (result+dp[n-1][i])%1000000000;
    	}
    	bw.write(String.valueOf(result));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}