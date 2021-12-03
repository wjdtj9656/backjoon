import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	int N = Integer.parseInt(br.readLine());
	    	boolean prime[] = new boolean[10001];
	    	prime[0] = prime[1] = true;
	    	for(int i=2; i*i<=10000; i++) {
	    		if(prime[i]) continue;
	    		for(int j=i*i; j<=10000; j+=i) {
	    			if(!prime[j]) prime[j] = true;
	    		}
	    	}
	    	for(int i=0; i<N; i++) {
	    		int temp = Integer.parseInt(br.readLine());
	    		boolean check = false;
	    		for(int j=temp/2; j<temp; j++) {
	    			for(int k=j; k>=2; k--) {
	    				if(prime[j] == true) continue;
	    				if(prime[k] == true) continue;
	    				if(j+k == temp) {
	    					bw.write(String.valueOf(k+" "+j+"\n"));
	    					check = true;
	    				}
	    			}
	    			if(check == true) break;
	    		}
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}