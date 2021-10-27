import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int N = Integer.parseInt(br.readLine());
	    	Deque<Integer> q = new LinkedList<>();
	    	
	    	for(int i=0; i<N; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		String temp = st.nextToken();
	    		switch(temp) {
	    		
	    		case "push": q.add(Integer.parseInt(st.nextToken())); break;
	    		case "pop": 
	    			if(q.isEmpty()) {
	    			bw.write(String.valueOf(-1)+"\n");
	    			}
	    			else {
	    			bw.write(String.valueOf(q.poll())+"\n");
	    			}
	    			break;
	    		case "size": bw.write(String.valueOf(q.size())+"\n"); break;
	    		case "empty": 
	    			if(q.isEmpty()) bw.write("1"+"\n");
	    			else bw.write("0"+"\n");
	    			break;
	    		case "front":
	    			if(q.isEmpty()) bw.write("-1"+"\n");
	    			else bw.write(String.valueOf(q.peekFirst())+"\n");
	    			break;
	    		case "back":
	    			if(q.isEmpty()) bw.write("-1"+"\n");
	    			else bw.write(String.valueOf(q.peekLast())+"\n");
	    			break;
	    		}
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}