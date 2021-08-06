package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 1744 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int arr[] = new int[input];
		long result = 0;
		for(int i=0; i<input; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int left = 0;
		int right = input-1;
		
		for(left = 0; left<right; left+=2) {
			if(arr[left] < 1 && arr[left+1] <1) {
				result += arr[left] * arr[left+1];
			}
			else {
				break;
			}
		}
		for(right=input-1; right>0; right-=2) {
			if(arr[right] > 1 && arr[right-1] > 1) {
				result += arr[right] * arr[right-1];
			}
			else {
				break;
			}
		}
		for(; right >= left; right--) {
			result +=arr[right];
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
}