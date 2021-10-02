	import java.util.*;
	import java.io.*;
	
	class Main {
		private static String solution(String str, String boom) {
			char[] result = new char[str.length()];
			int idx = 0;
			
			for(int i=0; i<str.length(); i++) {
				result[idx] = str.charAt(i);
				if(isBoom(result,idx,boom)) idx -= boom.length();
				idx++;
			}
			return String.valueOf(result, 0, idx);
		}
		private static boolean isBoom(char [] result, int idx, String boom) {
			if(idx < boom.length()-1) return false;
			
			for(int i=0; i<boom.length(); i++) {
				if(boom.charAt(i) != result[idx-boom.length()+1+i]) return false;
			}
			return true;
		}
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	String input = br.readLine();
	    	String boom = br.readLine();
	    	
	    	String answer = solution(input,boom);
	    	bw.write((answer.length()==0) ? "FRULA" : answer);
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}