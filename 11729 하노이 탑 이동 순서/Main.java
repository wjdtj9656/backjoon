import java.util.*;
import java.io.*;
	
	class Main {
		public static StringBuilder sb = new StringBuilder();
		public static void H(int N, int start, int mid, int to) {
			if(N == 1) {
				sb.append(start + " " + to + "\n");
				return;
			}
			
			H(N-1, start, to, mid);
			sb.append(start + " " + to +" "+"\n");
			H(N-1, mid, start, to);
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int N = Integer.parseInt(br.readLine());
	    	sb.append((int)Math.pow(2, N)-1+"\n");
	    	
	    	H(N,1,2,3);
	    	System.out.println(sb);
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}