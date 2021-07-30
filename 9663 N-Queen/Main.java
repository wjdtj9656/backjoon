package Baekjoon;

import java.io.*;
import java.util.*; 


public class Main { 
	/*
	 * 9663 problem
	 */
	
	static int arr[];
	static int num;
	static int count;
	static int result;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		num = Integer.parseInt(br.readLine());
		arr = new int[num];
		nQueen(0);
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static void nQueen(int depth) {
		if(depth == num) {
			count++;
			return;
		}
		for(int i=0; i<num; i++) {
			arr[depth] = i;
			
			if(posi(depth)) {
				nQueen(depth+1);
			}
		}
	}
	public static boolean posi(int col) {
		
		for(int i=0; i<col; i++) {
			if(arr[col] == arr[i]) {
				return false;
			}
			else if(Math.abs(arr[col]-arr[i]) == Math.abs(col-i)) {
				return false;
			}
		}
		return true;
	}
}
