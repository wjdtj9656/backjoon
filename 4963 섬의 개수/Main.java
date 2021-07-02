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
	static boolean visit[][];
	static int count = 0;
	static int[] dx = {0,0,1,-1,-1,1,-1,1};
	static int[] dy = {1,-1,0,0,-1,1,1,-1};
	static int w;
	static int h;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w==0 && h==0) {
				break;
			}
			list =new int[h][w];
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					list[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			visit = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(list[i][j] ==1 && !visit[i][j]) {
						dfs(i,j);
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
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<h && ny<w) {
				if(list[nx][ny] == 1 && !visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
