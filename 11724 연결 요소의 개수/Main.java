package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11724 problem
	*/

	static int list[][];
	static boolean visit[];
	static int count = 0;
	static int m;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[u][v] = 1;
			list[v][u] = 1;
		}
		visit = new boolean[n+1];
		
		for(int i=1; i<=n; i++) {
			if(visit[i] == false) {
				dfs(i);
				count++;
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
	}
	private static void dfs(int a) {
		if(visit[a] == true) {
			return;
		}
		else {
			visit[a] = true;
			for(int i=1; i<=n;i++) {
				if(list[a][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}
