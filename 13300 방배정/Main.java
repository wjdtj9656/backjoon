import java.io.*;
import java.util.*;

public class Main {

	static long C;
	static public long mul(long A, long ex) {
		if(ex == 1) {
			return A%C;
		}
		long temp = mul(A,ex/2);
		
		if(ex %2 == 1) {
			return (temp*temp%C) * A % C;
		}
		return temp*temp%C;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    long A = Long.parseLong(st.nextToken());
	    long B = Long.parseLong(st.nextToken());
	    C = Long.parseLong(st.nextToken());
	    bw.write(String.valueOf(mul(A,B)));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
