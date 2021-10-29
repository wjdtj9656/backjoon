import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static int result;
		static int N;
		static int[] arr,arr2;
		static boolean[] visit;
		public static void search(int index) {
			if(N == index) {
				int sum = 0;
				for(int i=0; i<N-1; i++) {
					sum += Math.abs(arr2[i]-arr2[i+1]);
				}
				result = Math.max(sum, result);
				return;
			}
			for(int i=0; i<N; i++) {
				if(visit[i] == true) continue;
				visit[i] = true;
				arr2[index] = arr[i]; 
				search(index+1);
				visit[i]= false;
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	N = Integer.parseInt(br.readLine());
	    	arr = new int[N];
	    	arr2 = new int[N];
	    	visit = new boolean[N];
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<N; i++) {
	    		arr[i] = Integer.parseInt(st.nextToken());
	    	}
	    	search(0);
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}