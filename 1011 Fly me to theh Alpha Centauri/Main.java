package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 1011 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int value = second - first;
			int max = (int) Math.sqrt(value);
			
			if(max == Math.sqrt(value)) {
				bw.write(String.valueOf(max*2 - 1)+"\n");
			}
			else if(value <= max * max + max) {
				bw.write(String.valueOf(max*2)+"\n");
			}
			else {
				bw.write(String.valueOf(max*2 +1)+"\n");
			}
		}
		
		br.close();
		bw.flush();	
		bw.close();
	}
}