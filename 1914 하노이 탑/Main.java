import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int count = 0;
    static StringBuilder sb = new StringBuilder();
	public static void hanoi(int n, int from, int temp, int to) throws IOException {
		if(n==0) return;
		//n-1À» A => B
		hanoi(n-1, from, to, temp);
		
		//n
		count++;
		sb.append(String.valueOf(from+" "+to)+"\n");
		
		//n-1À» B => C
		hanoi(n-1, temp, from, to);
	}
	    public static void main(String[] args) throws Exception {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        int N = Integer.parseInt(br.readLine());
	        BigInteger result = new BigInteger("1");
	        
	        if(N>20) {
	        	for(int i=0; i<N; i++) {
	        		result = result.multiply(new BigInteger("2"));
	        	}
	        	result = result.subtract(new BigInteger("1"));
	        	System.out.println(result);
	        }
	        else {
		        hanoi(N,1,2,3);
		        System.out.println(count);
		        bw.write(String.valueOf(sb.toString()));
	        }
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}
