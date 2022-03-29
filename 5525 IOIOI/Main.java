import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int N = Integer.parseInt(br.readLine());
	    int M = Integer.parseInt(br.readLine());
	    char ch[] = br.readLine().toCharArray();
	    int dp[] = new int[M];
	    int result = 0;
	    
	    for(int i=1; i<M-1; i++) {
	    	if(ch[i] == 'O' && ch[i+1] =='I' ) {
	    		dp[i+1] = dp[i-1]+1;
	    		if(dp[i+1] >= N && ch[i-2*N+1] == 'I') result++;
	    	}
	    }
	    bw.write(String.valueOf(result));
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
