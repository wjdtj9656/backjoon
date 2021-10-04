	import java.util.*;
	import java.io.*;
	
	class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	

	    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	    	String a = st.nextToken();
	    	String b = st.nextToken();
	    	int ans = a.length();
	    	
	    	for(int i=0; i<=b.length() - a.length(); i++) {
	    		int cnt = 0;
	    		for(int j=0; j<a.length(); j++) {
	    			if(a.charAt(j) != b.charAt(i+j))
	    				cnt++;
	    		}
	    		ans = Math.min(cnt,ans);
	    	}
	    	bw.write(String.valueOf(ans));
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}