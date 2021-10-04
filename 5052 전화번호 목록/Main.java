	import java.util.*;
	import java.io.*;
	
	class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int tc = Integer.parseInt(br.readLine());
	    	for(int tcn=0; tcn<tc; tcn++) {
	    		int n = Integer.parseInt(br.readLine());
	    		TreeSet<String> ts = new TreeSet<>();
	    		boolean resultSwitch = false;
	    		
	    		for(int i=0; i<n; i++) {
	    			ts.add(br.readLine());
	    		}
	    		for(int i=0; i<n-1; i++) {
	    			String temp1 = ts.pollFirst();
	    			String temp2 = ts.first();
	    			if(temp2.startsWith(temp1)) {
	    				resultSwitch = false;
	    				break;
	    			}
	    			resultSwitch = true;
	    		}
	    		bw.write((resultSwitch? "YES":"NO" )+"\n");
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}