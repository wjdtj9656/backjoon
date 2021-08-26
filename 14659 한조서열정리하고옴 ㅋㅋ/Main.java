package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 14659 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int max = 0;
		for(int i=0 ;i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<num; i++) {
			count = 0;
			for(int j=i+1; j<num; j++) {
				if(arr[i] <= arr[j]) {
					break;
				}
				else {
					count++;
					max = Math.max(count, max);
				}
			}
		}
		bw.write(String.valueOf(max));
		
		br.close();
		bw.flush();	
		bw.close();
	}
}