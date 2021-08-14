package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 11497 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			int numLog = Integer.parseInt(br.readLine());
			int min = 100000;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int arr[] = new int[numLog];
			int result[] = new int[numLog];
			for(int j=0; j<numLog; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			int left = 0;
			int right = numLog-1;
			
			for(int j=0; j<numLog; j++) {
				if(j%2 != 0) {
					result[left] = arr[j];
					left += 1;
				}
				else {
					result[right] = arr[j];
					right -= 1;
				}
			}
			min = Math.abs(result[0]-result[numLog-1]);
			for(int j=0; j<numLog-1; j++) {
				min = Math.max(min, Math.abs(result[j]-result[j+1]));
			}
			bw.write(String.valueOf(min)+"\n");
		}
		
		br.close();
		bw.flush();	
		bw.close();
	}
}