package Baekjoon;

import java.io.*;
import java.util.*;


public class Main { 
	/*
	 * 2437 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int arr[] = new int[input];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			for(int i=0; i<input; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(arr);
		
		int sum = 0;
		for(int i=0; i<input; i++) {
			if(sum + 1 < arr[i]) {
				break;
			}
			sum += arr[i];
		}
		bw.write(String.valueOf(sum + 1));
		br.close();
		bw.flush();
		bw.close();
	}
}