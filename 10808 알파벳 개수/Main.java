import java.util.*;
import java.io.*;

class Main {
	
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	char ss[] = s.toCharArray();
    	int result[] = new int[26];
    	
    	for(int i=0; i<ss.length; i++) {
    		result[ss[i]-97]++;
    		
    	}
    	
    	for(int i=0; i<result.length; i++) {
    		bw.write(result[i] + " ");
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}