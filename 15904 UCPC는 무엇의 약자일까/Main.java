package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 15904 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'U' && count==0) {
				count++;
			}
			else if(str.charAt(i) == 'C' && count == 1) {
				count++;
			}
			else if(str.charAt(i) == 'P' && count == 2) {
				count++;
			}
			else if(str.charAt(i) == 'C' && count == 3) {
				count++;
			}
		}
		if(count == 4) {
			bw.write("I love UCPC");
		}
		else {
			bw.write("I hate UCPC");
		}
		
		br.close();
		bw.flush();	
		bw.close();
	}
}