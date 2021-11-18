import java.util.*;
import java.io.*;
	
	class Main {
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	int num = 1;
	    	boolean sieve[] = new boolean[250000];
	    	Arrays.fill(sieve, true);
	    	sieve[0] = sieve[1] = false;
	    	for(int i=2; i*i<250000; i++) {
	    		for(int j=i*i; j<250000; j+=i) {
	    			sieve[j] = false;
	    		}
	    	}
	    	while(true) {
	    		int result = 0;
	    		num = Integer.parseInt(br.readLine());
	    		if(num == 0) break;
	    		for(int i=num+1; i<=2*num; i++) {
	    			if(!sieve[i]) continue;
	    			else {
	    				result++;
	    			}
	    		}
	    		bw.write(String.valueOf(result+"\n"));
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}