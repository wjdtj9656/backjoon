	import java.util.*;
	import java.io.*;
	
	class Main {
		
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	String s = br.readLine();
	    	bw.write(String.valueOf(s.length()));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}