package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 15903 problem
	 */
	static int[] result;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long arr[] = new long[n];
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			Arrays.sort(arr);
			long tempSum = arr[0] + arr[1];
			arr[0] = tempSum;
			arr[1] = tempSum;
			
			
		}
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		bw.write(String.valueOf(result));
		
		
		
		br.close();
		bw.flush();	
		bw.close();
	}
}