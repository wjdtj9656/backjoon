package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 10775 problem
	 */
	static int[] result;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int G = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		
		result = new int[G+1];
		int count = 0;
		for(int i=1; i<=G; i++) {
			result[i] = i;
		}
		
		for(int i=0; i<P; i++) {
			int g = Integer.parseInt(br.readLine());
			int emptyGate = find(g);
			
			if(emptyGate == 0) {
				break;
			}
			count++;
			union(emptyGate,emptyGate-1);
		}
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();
		bw.close();
	}
	public static int find(int x) {
		if( x == result[x]) {
			return x;
		}
		return result[x] = find(result[x]);
	}
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if( x != y ) {
			result[x] = y;
		}
	}
}