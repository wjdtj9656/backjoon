import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int N = Integer.parseInt(br.readLine());
	    	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	    	for(int i=0; i<N; i++) {
	    		int temp = Integer.parseInt(br.readLine());
	    		if(temp == 0) {
	    			if(pq.isEmpty()) bw.write(0+"\n");
	    			
	    			else {
	    				bw.write(String.valueOf(pq.peek())+"\n");
	    				pq.poll();
	    			}
	    		}
	    		else {
	    			pq.add(temp);
	    		}
	    	}
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}