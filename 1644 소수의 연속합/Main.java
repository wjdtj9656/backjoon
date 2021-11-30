import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int N = Integer.parseInt(br.readLine());
	    	boolean prime[] = new boolean[N+1];
	    	ArrayList<Integer> list = new ArrayList<>();
	    	Arrays.fill(prime, true);
	    	//0,1은 소수 아님
	    	prime[0] = prime[1] = false;
	    	//에라토스테네스의 체
	    	for(int i=2; i*i<=N; i++) {
	    		for(int j=i*i; j<=N; j+=i) {
	    			if(prime[j]) {
	    				prime[j] = false;
	    			}
	    		}
	    	}
	    	for(int i=1; i<=N; i++) {
	    		if(prime[i]) list.add(i);
	    	}
	    	
	    	int start = 0, end = 0;
	    	int sum = 0, result = 0;
	    	while(true) {
	    		if(sum >= N) sum -= list.get(start++);
	    		else if(end == list.size()) break;
	    		else sum += list.get(end++);
	    		if(sum == N) result++;
	    	}
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}