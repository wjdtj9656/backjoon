import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringBuilder sb = new StringBuilder();
	    	StringBuilder sb2 = new StringBuilder();
	    	String s = br.readLine();
	    	boolean check = false;
	    	
	    	for(int i=0; i<s.length(); i++){
	    		if(!check) {
	    		if(s.charAt(i) == ' ') {
	    			sb.append(sb2.reverse());
	    			sb.append(" ");
	    			sb2.delete(0, sb2.length());
	    		}
	    		else if(i == s.length()-1) {
	    			sb2.append(s.charAt(i));
	    			sb.append(sb2.reverse());
	    		}
	    		else if(s.charAt(i) == '<') {
	    			check = true;
	    			sb.append(sb2.reverse());
	    			sb2.delete(0, sb2.length());
	    			sb.append("<");
	    			
	    		}
	    		else {
	    			sb2.append(s.charAt(i));
	    		}
	    		}
	    		else {
	    			if(s.charAt(i) == '>') {
	    				check = false;
	    				sb.append(">");
	    			}
	    			else {
	    				sb.append(s.charAt(i));
	    			}
	    		}
	    	}
	    	bw.write(sb.toString());
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}