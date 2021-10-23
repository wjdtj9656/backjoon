import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static int MAX = Integer.MIN_VALUE;
		static int MIN = Integer.MAX_VALUE;
		static int[] operator = new int[4];
		static int[] num;
		static int N;
		public static void dfs(int nums, int idx) {
			if(idx == N) {
				MAX = Math.max(MAX, nums);
				MIN = Math.min(MIN, nums);
				return;
			}
			for(int i=0; i<4; i++) {
				if(operator[i] > 0) {
					operator[i]--;
					
					switch(i) {
					case 0: dfs(nums + num[idx], idx+1); break;
					case 1: dfs(nums - num[idx], idx+1); break;
					case 2: dfs(nums * num[idx], idx+1); break;
					case 3: dfs(nums / num[idx], idx+1); break;
					}
					operator[i]++;
				}
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	N = Integer.parseInt(br.readLine());
	    	
	    	num = new int[N];
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<N; i++) {
	    		num[i] = Integer.parseInt(st.nextToken());
	    	}
	    	st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<4; i++) {
	    		operator[i] = Integer.parseInt(st.nextToken());
	    	}
	    	
	    	dfs(num[0],1);
	    	bw.write(String.valueOf(MAX)+"\n");
	    	bw.write(String.valueOf(MIN)+"\n");
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}