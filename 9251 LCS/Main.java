package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 9251 problem
	 */
	static char[] str1;
	static char[] str2;
	
	static Integer[][] dp;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		str1 = br.readLine().toCharArray();
		str2 = br.readLine().toCharArray();
		
		dp = new Integer[str1.length][str2.length];
		
		bw.write(String.valueOf(LCS(str1.length-1,str2.length-1)));
		br.close();
		bw.flush();
		bw.close();
	}
	static public int LCS(int x, int y) {
		if(x==-1 || y==-1) {
			return 0;
		}
		
		if(dp[x][y] == null) {
			dp[x][y] = 0;
		
		
		if(str1[x] == str2[y]) {
			dp[x][y] =LCS(x-1,y-1) +1;
		}
		else {
			dp[x][y] = Math.max(LCS(x-1,y), LCS(x,y-1));
		}
	}
	return dp[x][y];
	
	
	}
}