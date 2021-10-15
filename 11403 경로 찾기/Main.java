	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    	int N = Integer.parseInt(br.readLine());
	    	int map[][] = new int[N][N];
	    	
	    	for(int i=0; i<N; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		for(int j=0; j<N; j++) {
	    			map[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	//점 k를 지나간다.
	    	for(int k=0; k<N; k++) {
	    		//점 i에서 시작
	    		for(int i=0; i<N; i++) {
	    			//점 j에서 시작
	    			for(int j=0; j<N; j++) {
	    				if(map[i][k] == 1 && map[k][j] == 1)
	    					map[i][j] = 1;
	    			}
	    		}
	    	}
	    	for(int i=0; i<N; i++) {
	    		for(int j=0; j<N; j++) {
	    			bw.write(String.valueOf(map[i][j]+" "));
	    		}
	    		bw.write("\n");
	    	}
	    		
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}