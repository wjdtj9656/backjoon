package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 1339 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String str[] = new String[num];
		int alphabet[] = new int[26];
		int max = 0;
		for(int i=0; i<num; i++) {
			str[i] = br.readLine();
			for(int j=0; j<str[i].length(); j++) {
				alphabet[str[i].charAt(j)-65] += Math.pow(10,str[i].length()-(j+1));
			}
		}
		Arrays.sort(alphabet);
		int index = 9;
		int sum = 0;
		for(int i=alphabet.length-1; i>=0; i--) {
			if(alphabet[i] == 0) {
				break;
			}
			sum += alphabet[i]*index;
			index--;
		}
		bw.write(String.valueOf(sum));
		br.close();
		bw.flush();
		bw.close();
	}
}