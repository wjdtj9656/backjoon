package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 14501 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int t[] =new int[num+15];
		int p[] =new int[num+15];
		int dp[] =new int[num+15];
		int max = 0;
		
		for(int i=0;i<num; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		t[i] = Integer.parseInt(st.nextToken());
		p[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<=num; i++) {
			dp[i] = Math.max(dp[i],max); 
			
			dp[t[i]+i] = Math.max(dp[t[i]+i], p[i]+dp[i]);
			
			max = Math.max(max,dp[i]);
		}
		
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
	}
	
}
