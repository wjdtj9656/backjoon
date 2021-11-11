import java.util.*;
import java.io.*;
	
	class Main {
		static int N,M;
		static int arr[];
		static boolean[] visit;
		public static void dfs(int N, int M, int depth) {
			if(depth == M) {
				for(int val : arr) {
					System.out.print(val+" ");
				}
				System.out.println();
				return;
			}
			for(int i=0; i<N; i++) {
				if(!visit[i]) {
					visit[i] = true;
					arr[depth] = i+1;
					dfs(N, M, depth+1);
					visit[i] = false;
				}
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	N = Integer.parseInt(st.nextToken());
	    	M = Integer.parseInt(st.nextToken());
	    	visit = new boolean[N];
	    	arr = new int[M];
	    	dfs(N, M, 0);
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}