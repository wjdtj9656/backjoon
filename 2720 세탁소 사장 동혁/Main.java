package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 2720 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int Q=25;
		int D=10;
		int N=5;
		int P=1;
		
		for(int i=0; i<input; i++) {
			int result[] = new int[4];
			int num = Integer.parseInt(br.readLine());
			while(num != 0) {
				if(num >= 25) {
					num -= Q;
					result[0]++;
				}
				else if(num >= 10) {
					num -= D;
					result[1]++;
				}
				else if(num >= 5) {
					num -= N;
					result[2]++;
				}
				else {
					num -= P;
					result[3]++;
				}
			}
			for(int j=0; j<4; j++) {
				bw.write(String.valueOf(result[j])+" ");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}