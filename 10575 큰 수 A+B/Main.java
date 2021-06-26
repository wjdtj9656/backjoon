package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	9375 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a =st.nextToken();
		String b = st.nextToken();
		BigInteger result = new BigInteger(a);
		BigInteger result2 = new BigInteger(b);
		result = result.add(result2);
		String.valueOf(String.valueOf(result));
		//bw.write(String.valueOf(a) + String.valueOf(b));
		
		bw.flush();
		bw.close();
	}
	
}
