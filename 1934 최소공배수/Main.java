package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1934 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		for(int i=0; i<input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = 0;
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			result = euc(a,b);
			bw.write(String.valueOf(a*b/result)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
	static int euc(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return euc(b,a%b);
		}
	}
}
