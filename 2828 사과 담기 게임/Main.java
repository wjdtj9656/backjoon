package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 2828 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int appleNum = Integer.parseInt(br.readLine());
		int count = 0;
		int left = 1;
		int right = M;
		
		for(int i=0; i<appleNum; i++) {
		
			int pos = Integer.parseInt(br.readLine());
			
			if(left <= pos && pos <= right) {
				continue;
			}
			
			if(left > pos) {
				count += left - pos;
				right -= left - pos;
				left = pos;
			}
			else {
				count += pos - right;
				left += pos - right;
				right = pos;
			}
		}
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();	
		bw.close();
	}
}