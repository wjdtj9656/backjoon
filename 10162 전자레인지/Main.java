package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 9251 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = 300;
		int resultA = 0;
		int B = 60;
		int resultB = 0;
		int C = 10;
		int resultC = 0;
		
		int num = Integer.parseInt(br.readLine());
		while(num != 0) {
			if(num >=300) {
				num -= 300;
				resultA++;
			}
			else if(num >= 60) {
				num -= 60;
				resultB++;
			}
			else {
				num -= 10;
				resultC++;
			}
			if(num < 0) {
				System.out.println(-1);
				return;
			}
		}
		bw.write(String.valueOf(resultA)+" "+String.valueOf(resultB)+" "+String.valueOf(resultC));
		
		br.close();
		bw.flush();
		bw.close();
	}
}