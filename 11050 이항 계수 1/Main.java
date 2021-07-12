package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 11050 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 1;
		int repeat = M;
		
		for(int i=0; i<repeat; i++) {
			result *=N;
			N-=1;
		}
		for(int i=0; i<repeat; i++) {
			result /= M;
			M-=1;
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
