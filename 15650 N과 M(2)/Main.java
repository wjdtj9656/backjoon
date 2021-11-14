import java.util.*;
import java.io.*;
	
	class Main {
		static int N,M;
		static int arr[];
		public static void dfs(int n, int depth) {
			if(depth == M) {
				for(int val : arr) {
					System.out.print(val+" ");
				}
				System.out.println();
				return;
			}
			for(int i=n; i<=N; i++) {
					arr[depth] = i;
					dfs(i+1, depth+1);
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	N = Integer.parseInt(st.nextToken());
	    	M = Integer.parseInt(st.nextToken());
	    	arr = new int[M];
	    	dfs(1, 0);
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}