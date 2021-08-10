package Baekjoon;

import java.io.*;
import java.util.*;


public class Main { 
	/*
	 * 16953 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());
		int count = 1;
		
		while(start < goal) {
			if(goal % 2 != 0 && goal%10 != 1) {
				count = -1;
				break;
				
			}
			if(goal %2 == 0) {
				goal >>= 1;
				count++;
			}
			else {
				goal -= 1;
				goal /= 10;
				count++;
			}
			System.out.println(goal);
		}
		if(start != goal) count = -1;
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();
		bw.close();
	}
}