	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st =new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int K = Integer.parseInt(st.nextToken());
	    	int arr[][] = new int[N+1][K+1];
	    	int weightAndValue[][] = new int[N+1][2];
	    	int result = 0;
	    	for(int i=1; i<=N; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		//weight
	    		weightAndValue[i][0] = Integer.parseInt(st.nextToken());
	    		//value
	    		weightAndValue[i][1] = Integer.parseInt(st.nextToken());
	    	}
	    	for(int i=1; i<=N; i++) {
	    		for(int j=1; j<=K; j++) {
	    			arr[i][j] = arr[i-1][j];
	    			if(j >= weightAndValue[i][0]) {
	    				arr[i][j] = Math.max(arr[i-1][j], weightAndValue[i][1]);
	    			}
	    			result = Math.max(arr[i][j], result);
	    			
	    		}
	    	}
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}