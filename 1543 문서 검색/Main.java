package Baekjoon;

import java.io.*;
import java.util.*;


public class Main { 
	/*
	 * 1543 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String wantStr = br.readLine();
		int result = 0;
		for(int i=0; i<str.length() - wantStr.length()+1; i++) {
			String temp = str.substring(i, i+wantStr.length());
			if(temp.equals(wantStr)) {
				result++;
				i += wantStr.length() - 1;
			}
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
}