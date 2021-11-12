import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	int min = Math.min(N, M);
	    	int result = 1;
	    	int arr[][] = new int[N][M];
	    	for(int i=0; i<N; i++) {
	    		String temp = br.readLine();
	    		for(int j=0; j<M; j++) {
	    			arr[i][j] = temp.charAt(j) - '0';
	    		}
	    	}
	    	
	    	for(int k=2; k<=min; k++) {
	    		for(int i=0; i<N-k+1; i++) {
	    			for(int j=0; j<M-k+1; j++) {
	    				if(arr[i][j]==arr[i+k-1][j] && arr[i][j]==arr[i][j+k-1] && arr[i][j]==arr[i+k-1][j+k-1]) {
	    					if(result < k) {
	    						result = k;
	    					}
	    				}
	    			}
	    		}
	    	}
	    	bw.write(String.valueOf(result*result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}