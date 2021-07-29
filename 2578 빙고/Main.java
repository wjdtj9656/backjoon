package Baekjoon;

import java.io.*;
import java.util.*; 


public class Main { 
	/*
	 * 14889 problem
	 */
	static boolean[][] visit;
	static int count;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[][] = new int[5][5];
		visit = new boolean[5][5];
		for(int i=0; i<5; i++) {		
		StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		count = 0;
		
		for(int i=0; i<5; i++) {		
			StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0; j<5; j++) {

					int num = Integer.parseInt(st.nextToken());
					
					for(int a=0; a<5; a++) {
						for(int b=0; b<5; b++) {
							if(num==arr[a][b]) {
								visit[a][b] = true;
							}
						}
					}
					rCheck();
					cCheck();
					llCheck();
					rrCheck();
					
					if(count >= 3) {
						System.out.println(5*(i)+j+1);
						return;
					}
					count = 0;
				}
			}
		br.close();
		bw.flush();
		bw.close();
	}
	public static void rCheck() {
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(visit[i][j]==true) cnt++;
			}
			if(cnt==5) count++;
		}
	}
	public static void cCheck() {
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(visit[j][i]==true) cnt++;
			}
			if(cnt==5) count++;
		}
	}
	public static void llCheck() {
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(visit[i][i]==true) cnt++;
		}
		if(cnt==5) count++;
	}
	public static void rrCheck() {
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(visit[i][4-i]==true) cnt++;
		}
		if(cnt==5) count++;
	}
}
