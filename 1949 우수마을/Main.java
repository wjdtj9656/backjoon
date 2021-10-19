import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		static int N;
		static int[] person;
		static int[][] dp;
		static ArrayList<Integer>[] v;
		
		public static void dfs(int n, int parent) {
			for(int node : v[n]) {
				if(node != parent) {
					dfs(node, n);
					dp[n][0] += Math.max(dp[node][0], dp[node][1]);
					dp[n][1] += dp[node][0];
				}
			}
			dp[n][1] += person[n];
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	N = Integer.parseInt(br.readLine());
	    	String[] input = br.readLine().split(" ");
	    	person = new int[N+1];
	    	v = new ArrayList[N+1];
	    	//dp[n][1] => n�� �������
	    	//dp[n][0] => n�� ������� �ƴҶ�
	    	dp = new int[N+1][2];
	    	
	    	for(int i=0; i<=N; i++) {
	    		v[i] = new ArrayList<>();
	    	}
	    	
	    	for(int i=1; i<=N; i++) {
	    		person[i] = Integer.parseInt(input[i-1]);
	    	}
	    	for(int i=0; i<N-1; i++) {
	    		input = br.readLine().split(" ");
	    		int a = Integer.parseInt(input[0]);
	    		int b = Integer.parseInt(input[1]);
	    		v[a].add(b);
	    		v[b].add(a);
	    	}
	    	dfs(1,0);
	    	bw.write(Math.max(dp[1][0], dp[1][1])+"\n");
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}