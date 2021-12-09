import java.util.*;
import java.io.*;
import java.math.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	BigInteger num1 = BigInteger.ONE;
	    	BigInteger num2 = BigInteger.ONE;
	    	for(int i=0; i<M; i++) {
	    		num1 = num1.multiply(new BigInteger(String.valueOf(N-i)));
	    		num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
	    	}
	    	BigInteger result = num1.divide(num2);
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}