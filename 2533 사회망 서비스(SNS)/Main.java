import java.util.*;
import java.io.*;
import java.math.*;
	
	class Main {
		static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		static int[][] dp;
		static void dp(int cur, int parent) {
			//얼리어답터 아닐때
			dp[cur][0] = 0;
			//얼리어답터 일때
			dp[cur][1] = 1;
			
			for(int next : list.get(cur)) {
				if(next != parent) {
				dp(next, cur);
				dp[cur][0] += dp[next][1];
				dp[cur][1] += Math.min(dp[next][0], dp[next][1]);
				}
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	int num = Integer.parseInt(br.readLine());
	    	dp = new int[num+1][2];
	    	for(int i=0; i<=num; i++) {
	    		list.add(new ArrayList<>());
	    	}
	    	for(int i=0; i<num-1; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int a = Integer.parseInt(st.nextToken());
	    		int b = Integer.parseInt(st.nextToken());
	    		list.get(a).add(b);
	    		list.get(b).add(a);
	    	}
	    	dp(1,-1);
	    	bw.write(String.valueOf(Math.min(dp[1][0], dp[1][1])));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}