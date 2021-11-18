import java.util.*;
import java.io.*;
	
	class Main {
		static int arr[];
		static boolean visit[];
		public static void dfs(int start, int depth) {
			if(depth == 6) {
				for(int i=0; i<arr.length; i++) {
					if(visit[i]) System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			for(int i=start; i<arr.length; i++) {
					visit[i] = true;
					dfs(i+1,depth+1);
					visit[i] = false;
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	while(true) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int size = Integer.parseInt(st.nextToken());
	    		if(size == 0) break;
	    		arr = new int[size];
	    		visit = new boolean[size];
	    		for(int i=0; i<size; i++) {
	    			arr[i] = Integer.parseInt(st.nextToken());
	    		}
	    		dfs(0,0);
	    		System.out.println();
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}