import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int N = Integer.parseInt(br.readLine());
	    String s[] = new String[N];
	    for(int i=0; i<N; i++) {
	    	s[i] = br.readLine();
	    }
	    String result = "";
	    for(int j=0; j<s[0].length(); j++) {
	    	boolean flag = false;
	    	for(int k=1; k<N; k++) {
	    		if(s[k].charAt(j) != s[k-1].charAt(j)) flag = true;
	    	}
	    	if(!flag) result += s[0].charAt(j);
	    	else result+= "?";
	    }
	    bw.write(result);
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
