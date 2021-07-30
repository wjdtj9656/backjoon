package Baekjoon;

import java.io.*;
import java.util.*; 


public class Main { 
	/*
	 * 11656 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			String str = br.readLine();
			String str1[] = new String[str.length()];
			for(int i=0; i<str.length(); i++) {
				str1[i] = str.substring(i,str.length());
			}
			Arrays.sort(str1);
			for(String str2 :str1) {
				bw.write(str2+"\n");
			}
		br.close();
		bw.flush();
		bw.close();
	}
}
