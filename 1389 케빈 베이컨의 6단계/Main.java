	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st =new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	int map[][] = new int[N][N];
	    	int min = (int)10e9;
	    	int result = 0;
	    	
	    	for(int i=0; i<M; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int temp1 = Integer.parseInt(st.nextToken());
	    		int temp2 = Integer.parseInt(st.nextToken());
	    		map[temp1-1][temp2-1] = 1;
	    		map[temp2-1][temp1-1] = 1;
	    	}
	    	for(int i=0; i<N; i++) {
	    		for(int j=0; j<N; j++) {
	    			if(map[i][j] != 1) {
	    				map[i][j] = (int)1e9;
	    			}
	    		}
	    	}
	    	for(int k=0; k<N; k++) {
	    		for(int i=0; i<N; i++) {
	    			for(int j=0; j<N; j++) {
	    				if(map[i][k] + map[k][j] < map[i][j]) {
	    					map[i][j] = map[i][k] + map[k][j];
	    				}
	    			}
	    		}
	    	}
	    	for(int i=0; i<N; i++) {
    			int resultTemp = 0;
	    		for(int j=0; j<N; j++) {
	    			if(i == j) {
	    				continue;
	    			}
	    			else {
	    				resultTemp += map[i][j];
	    			}
	    		}
	    		if(min > resultTemp) {
	    			min = resultTemp;
	    			result = i;
	    		}
	    		
	    	}
	    	bw.write(String.valueOf(result+1));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}