package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1012 problem
	*/

	private static int list[][];
	private static boolean visit[][];
	private static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int t=0;t<testcase;t++) {
			count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			list = new int[n][m+1];
			for(int i=0;i<k;i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				list[x][y] = 1;
			}
			visit = new boolean[n][m];
			for(int x=0;x<n;x++) {
				for(int y=0;y<m;y++) {

					if(list[x][y]==1 && !visit[x][y]) {
					dfs(x,y,n,m);
					count++;
					}
				}
			}
			bw.write(String.valueOf(count)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	static void dfs(int x, int y,int n, int m) {
		visit[x][y] = true;
		//오른쪽
		if(y+1<m && list[x][y+1]==1 && !visit[x][y+1]) {
			dfs(x,y+1,n,m);
		}
		//밑으로
		if(x+1<n && list[x+1][y]==1 && !visit[x+1][y]) {
			dfs(x+1,y,n,m);
		}
		//왼쪽으로
		if(y-1>=0 && list[x][y-1]==1 && !visit[x][y-1]) {
			dfs(x,y-1,n,m);
		}
		//위로
		if(x-1>=0 && list[x-1][y]==1 && !visit[x-1][y]) {
			dfs(x-1,y,n,m);
		}
	}
}
